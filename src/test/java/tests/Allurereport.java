package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Allurereport {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set path to chromedriver if required
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void verifyGoogleLogoIsDisplayed() {
        // Locate the Google logo using XPath
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
        
        // Assert that logo is displayed
        Assert.assertTrue(logo.isDisplayed(), "Google logo should be displayed.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
