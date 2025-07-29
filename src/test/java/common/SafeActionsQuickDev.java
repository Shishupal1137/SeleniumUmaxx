package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class SafeActionsQuickDev extends SyncQuickDev {
    public WebDriver driver = BasesetupQuickDev.driver; // Set driver globally

    public void safeClick(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
            Thread.sleep(2000); // Reduce sleep for better performance
        } catch (Exception e) {
            System.out.println("Element not found or not clickable: " + locator + " | Error: " + e.getMessage());
        }
    }

    public void safeType(String locator, String value) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(value);
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Unable to type in element: " + locator + " | Error: " + e.getMessage());
        }
    }

    // New safeClear Method
    public void safeClear(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            element.clear(); // First try using clear()
            Thread.sleep(1000);

            // If clear() does not work, use Keys.CONTROL + A + BACKSPACE
            if (!element.getAttribute("value").isEmpty()) {
                element.sendKeys(Keys.CONTROL + "a");
                element.sendKeys(Keys.BACK_SPACE);
            }

            System.out.println("Successfully cleared text field: " + locator);
        } catch (Exception e) {
            System.out.println("Unable to clear text field: " + locator + " | Error: " + e.getMessage());
        }
    }

    public boolean safeIsDisplayed(String locator) {
        try {
            return driver.findElement(By.xpath(locator)).isDisplayed();
        } catch (Exception e) {
            System.out.println("Unable to check if element is displayed: " + locator + " | Error: " + e.getMessage());
            return false;
        }
    }

    public boolean safeIsEnabled(String locator) {
        try {
            return driver.findElement(By.xpath(locator)).isEnabled();
        } catch (Exception e) {
            System.out.println("Unable to check if element is enabled: " + locator + " | Error: " + e.getMessage());
            return false;
        }
    }

    public boolean safeIsSelected(String locator) {
        try {
            return driver.findElement(By.xpath(locator)).isSelected();
        } catch (Exception e) {
            System.out.println("Unable to check if element is selected: " + locator + " | Error: " + e.getMessage());
            return false;
        }
    }

    public String getText(String locator) {
        try {
            return driver.findElement(By.xpath(locator)).getText();
        } catch (Exception e) {
            System.out.println("Unable to get text from element: " + locator + " | Error: " + e.getMessage());
            return "";
        }
    }

    public String getAttribute(String locator, String attribute) {
        try {
            return driver.findElement(By.xpath(locator)).getAttribute(attribute);
        } catch (Exception e) {
            System.out.println("Unable to get attribute '" + attribute + "' from element: " + locator + " | Error: " + e.getMessage());
            return "";
        }
    }

    public void selectByIndex(String locator, int index) {
        try {
            driver.findElements(By.xpath(locator)).get(index).click();
        } catch (Exception e) {
            System.out.println("Unable to select element at index " + index + ": " + locator + " | Error: " + e.getMessage());
        }
    }
}