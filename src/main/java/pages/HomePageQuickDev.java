package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageQuickDev {
public WebDriver  driver;
public HomePageQuickDev(WebDriver driver) {
	this.driver=driver;
}
String dashboardLoc="//div[text() = 'Dashboard']";
public void validateDashboardAvailability()
{
boolean flag=	driver.findElement(By.xpath(dashboardLoc)).isDisplayed();
System.out.println("Home is visible: "+flag);
}
}
