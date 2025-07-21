package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageQuickDev {
    public WebDriver driver;

    public LoginPageQuickDev(WebDriver driver) {
        this.driver = driver;
    }

    String UseNowLoc = "(//a[text() = 'Use Now'])[1]";
    String EmailidLoc = "//input[@type = 'email']";
    String PasswordLoc = "//input[@type = 'password']";
    String SignInLoc = "//button[text() = ' Sign In ']"; // Removed extra spaces

    public void useNowbutton() throws Exception {
        driver.findElement(By.xpath(UseNowLoc)).click();
        Thread.sleep(5000);
    }

    public void entermailid(String EmailidValue) {
        driver.findElement(By.xpath(EmailidLoc)).sendKeys(EmailidValue);
    }

    public void enterpassword(String passwordValue) {
        driver.findElement(By.xpath(PasswordLoc)).sendKeys(passwordValue);
    }

    public void siginbutton() throws Exception {
        driver.findElement(By.xpath(SignInLoc)).click();
        Thread.sleep(5000);
    }
}
