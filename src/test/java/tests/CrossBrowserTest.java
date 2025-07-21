package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

    public static void main(String[] args) {
        String browser = "chrome";  // change to "firefox" or "edge" to test in other browsers
        WebDriver driver = null;

        try {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();
            } else {
                throw new IllegalArgumentException("Unsupported browser: " + browser);
            }

            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            System.out.println("Title is: " + driver.getTitle());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}