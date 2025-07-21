
package common;
import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.HomePageQuickDev;
//import pages.LoginPage;
import pages.LoginPageQuickDev;
public class BasesetupQuickDev{
	public static WebDriver driver;
	ExtentReports extentReports;
	public static ExtentTest extentTest;
	@BeforeSuite
	public void beforeSuite() throws Exception {
		System.out.println(ConfigReaderQuickDev.getKeyValue("BROWSERNAME"));
			switch (ConfigReaderQuickDev.getKeyValue("BROWSERNAME")) {
			case "CHROME": {
				driver = new ChromeDriver();
				break;
			}
			case "FF": {
				driver = new FirefoxDriver();

			}
			case "IE": {
				driver = new InternetExplorerDriver();

			}
			default:
				System.out.println("Please Provide the Valide Web Driver ");

			}
			driver = new ChromeDriver();
			driver.get(ConfigReaderQuickDev.getKeyValue("URL"));
			driver.manage().window().maximize();
			Thread.sleep(5000);
			LoginPageQuickDev loginpageQuickDev = new LoginPageQuickDev(driver);
			loginpageQuickDev.useNowbutton();
			loginpageQuickDev.entermailid(ConfigReaderQuickDev.getKeyValue("USERNAME"));
			loginpageQuickDev.enterpassword(ConfigReaderQuickDev.getKeyValue("PASSWORD"));
			loginpageQuickDev.siginbutton();
			
			HomePageQuickDev HomepageQuickDev = new HomePageQuickDev(driver);
	        HomepageQuickDev.validateDashboardAvailability();
	        
	        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("CreateApplication.html");
	        
	        extentSparkReporter.config().setTheme(Theme.DARK);
			extentSparkReporter.config().setDocumentTitle("Automation Test Report");
			extentSparkReporter.config().setReportName("Ncs report");
			
			extentReports = new ExtentReports();
			extentReports.attachReporter(extentSparkReporter);

			extentReports.setSystemInfo("ENV", "PROD");
			extentReports.setSystemInfo("SUITE", "Sanity");
			
				}
	@BeforeMethod
	public void beforeMethod(Method method) {
		extentTest = extentReports.createTest(method.getName());
	}
	@AfterMethod
	public void takeScreenshot(Method method) throws Exception {
		TakesScreenshot take = (TakesScreenshot) driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File des = new File(method.getName() + ".png");
		FileHandler.copy(src, des);

		extentTest.info("Final Screenshot of the Test",
				MediaEntityBuilder.createScreenCaptureFromPath(method.getName() + ".png").build());
			
			
	}
	
	@AfterSuite
	public void afterSuite() {
		extentReports.flush();
		driver.quit();

	}
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




		
	
	
	
	

