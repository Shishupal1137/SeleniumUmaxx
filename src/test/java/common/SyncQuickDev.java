package common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncQuickDev extends ConstantVariableQuickDev{
	public static WebDriver driver;
	
	public SyncQuickDev(){
		this.driver=BasesetupQuickDev.driver;
		
	}
	public void needToWait(int second)
	{
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void safeImplicitWait(int second)
	{
		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
	}
	
	
	public void safeExplicitWait(String locator, int second) {
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	
	//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	
	public void safeFluentWait(String locator, int maxtimeOutSecond, int pollingEverySecond )
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(maxtimeOutSecond))
		        .pollingEvery(Duration.ofSeconds(pollingEverySecond))
		        .ignoring(NoSuchElementException.class);
		WebElement foo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}

}