package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeTest {
	WebDriver  driver;
  @Test
  public void websiteslaunching() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize(); 
        
	
  }
  @Test(priority = 2)
  public void IframeTest() throws Exception {
	 driver.findElement(By.xpath("//a[text() = 'SwitchTo']")).click();
	 Thread.sleep(2000);
	 
   driver.findElement(By.xpath("//a[text() = 'Frames']")).click();
   Thread.sleep(2000);
   
   
   driver.switchTo().frame(0); 
   
   driver.findElement(By.xpath("(//input[@type = 'text'])[1]")).sendKeys("hello");
   Thread.sleep(2000);
   
   
   driver.switchTo().defaultContent();
   
   
   
   driver.findElement(By.xpath("//a[text() = 'Iframe with in an Iframe']")).click();
   Thread.sleep(2000);
   
   driver.switchTo().frame(0); 

   driver.switchTo().frame(0); 

 driver.findElement(By.xpath("(//input[@type = 'text'])[1]")).sendKeys("hello");
 Thread.sleep(2000);


// Optional: Go back to main content
driver.switchTo().defaultContent();


  }
}
