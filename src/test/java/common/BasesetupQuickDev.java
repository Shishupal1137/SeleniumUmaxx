package common;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.HomePageQuickDev;
import pages.LoginPageQuickDev;

public class BasesetupQuickDev {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports extentReports;

    @BeforeSuite
    public void setupSuite() {
        try {
            if (driver == null) {
                String browser = ConfigReaderQuickDev.getKeyValue("BROWSERNAME");
                switch (browser.toUpperCase()) {
                    case "CHROME":
                        driver = new ChromeDriver();
                        break;
                    case "FF":
                        driver = new FirefoxDriver();
                        break;
                    case "IE":
                        driver = new InternetExplorerDriver();
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported browser: " + browser);
                }

                driver.get(ConfigReaderQuickDev.getKeyValue("URL"));
                driver.manage().window().maximize();
                Thread.sleep(3000);

                // Login once for all tests
                LoginPageQuickDev loginPage = new LoginPageQuickDev(driver);
                loginPage.useNowbutton();
                loginPage.entermailid(ConfigReaderQuickDev.getKeyValue("USERNAME"));
                loginPage.enterpassword(ConfigReaderQuickDev.getKeyValue("PASSWORD"));
                loginPage.siginbutton();

                HomePageQuickDev homePage = new HomePageQuickDev(driver);
                homePage.validateDashboardAvailability();
            }

            // Set up Extent report
            ExtentSparkReporter spark = new ExtentSparkReporter("CreateApplication.html");
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Automation Test Report");
            spark.config().setReportName("Ncs report");

            extentReports = new ExtentReports();
            extentReports.attachReporter(spark);
            extentReports.setSystemInfo("ENV", "PROD");
            extentReports.setSystemInfo("SUITE", "Sanity");

        } catch (Exception e) {
            System.out.println("Setup failed: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Suite setup failed", e);
        }
    }

    @BeforeMethod
    public void startTest(Method method) {
        extentTest = extentReports.createTest(method.getName());
        waitForHomePageVisibleAndModalClosed(); // Ensure clean UI before every test
    }

    @AfterMethod
    public void captureScreenshot(Method method) throws Exception {
        if (driver != null) {
            TakesScreenshot take = (TakesScreenshot) driver;
            File src = take.getScreenshotAs(OutputType.FILE);
            File des = new File(method.getName() + ".png");
            FileHandler.copy(src, des);

            extentTest.info("Final Screenshot",
                    MediaEntityBuilder.createScreenCaptureFromPath(method.getName() + ".png").build());
        }
    }

    @AfterSuite
    public void tearDownSuite() {
        if (extentReports != null)
            extentReports.flush();
        if (driver != null)
            driver.quit();
    }

    // 🟩 Utility Method: Wait for Home visible & Modal (if any) to close
    public void waitForHomePageVisibleAndModalClosed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Home']")));
            passLog("✅ Home page is visible");
        } catch (Exception e) {
            warningLog("⚠️ Home page not found: " + e.getMessage());
        }

        try {
            By modal = By.id("imageModal");
            wait.until(ExpectedConditions.invisibilityOfElementLocated(modal));
            passLog("✅ Modal is closed");
        } catch (Exception e) {
            infoLog("ℹ️ Modal was not visible or already closed");
        }
    }

    // 🔧 Logging utilities
    public static void setDes(String des) {
        extentTest.getModel().setDescription(des);
    }

    public static void passLog(String steps) {
        extentTest.log(Status.PASS, steps);
    }

    public static void failLog(String steps) {
        extentTest.log(Status.FAIL, steps);
    }

    public static void warningLog(String steps) {
        extentTest.log(Status.WARNING, steps);
    }

    public static void infoLog(String steps) {
        extentTest.log(Status.INFO, steps);
    }

    public static void skipLog(String steps) {
        extentTest.log(Status.SKIP, steps);
    }
}
