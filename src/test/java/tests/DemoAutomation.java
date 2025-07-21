package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAutomation {
	WebDriver driver;
  @Test
  public void loginFunctionality() throws Exception {
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
  
  driver.manage().window().maximize();
  Thread.sleep(5000);
}
  
  public void test() throws Exception {
	  driver.findElement(By.xpath("//a[text() = 'Practice Site']")).click();
	  Thread.sleep(5000);
  }
  
  
  
  public void fillfirstname() throws Exception {
	  driver.findElement(By.xpath("//input[@placeholder ='First Name']")).sendKeys("shishupal");
	  Thread.sleep(2000);
	  
  }
  
  public void filllastname() throws Exception {
	  driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys("singh");
	  Thread.sleep(2000);
  }
  
  
  public void address() throws Exception {
	  driver.findElement(By.xpath("//textarea[@ng-model = 'Adress']")).sendKeys("indore");
	  Thread.sleep(2000);
  }
  
  public void fillemail() throws Exception {
	  driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("shishupal@gmail.com");
	  Thread.sleep(2000);
	 
  }
  
  public void phone() throws Exception {
	  driver.findElement(By.xpath("//input[@ng-model = 'Phone']")).sendKeys("9555537343");
	  Thread.sleep(2000);
  }
  
  public void male() throws Exception {
	driver.findElement(By.xpath("//label[text() = ' Male ']")).click();
	  Thread.sleep(2000);
  }
  
  public void hobbies() throws Exception {
	  driver.findElement(By.xpath("//label[text() = 'Hobbies']//following::input[1]")).click();  
  Thread.sleep(2000);
  }
  
  
  public void scrollToBottom() throws Exception {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    Thread.sleep(2000);
	}
  
  
  public void clicklanguage() throws Exception {
	  driver.findElement(By.xpath("//label[text() = 'Languages']//following::div[1]")).click();
	  Thread.sleep(2000);
  }
  
  public void selectlanguage() throws Exception {
	  driver.findElement(By.xpath("//div[@id = 'msdd']//following::li[1]")).click();
	  Thread.sleep(2000);
  }
  
  public void scrollfunction() throws Exception {
  WebElement lastItem = driver.findElement(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li)[last()]"));
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastItem);
  Thread.sleep(2000);

  }
  
  public void hobbies1() throws Exception {
	  driver.findElement(By.xpath("//label[text() = 'Hobbies']//following::input[2]")).click();  
  Thread.sleep(2000);
  }
  
  
  public void selectcountry() throws Exception {
	  driver.findElement(By.xpath("//label[text() = 'Select Country :']//following::span[1]")).click();
	  Thread.sleep(2000);
	  
  }
  
  public void searchcountry() throws Exception {
	  driver.findElement(By.xpath("//input[@type ='search']")).sendKeys("ind");
	  Thread.sleep(2000);
  }

  public void selectindia() throws Exception {
	  driver.findElement(By.xpath("//li[@role = 'treeitem']")).click();
	  Thread.sleep(2000);
  }
  
  public void Day() throws Exception {
	  driver.findElement(By.xpath("//select[@placeholder = 'Day']")).sendKeys("8");
	  Thread.sleep(2000);
  }
  
  public void Year() throws Exception {
	  driver.findElement(By.xpath("//select[@placeholder ='Year']")).sendKeys("2001");
	  Thread.sleep(2000);
  }
  

  
  
  
  public static void main(String[] args) throws Exception {
	  DemoAutomation demo = new DemoAutomation();
	  demo.loginFunctionality();
	//  demo.test();
	  demo.fillfirstname();
	  demo.filllastname();
	  demo.address();
	  demo.fillemail();
	  demo.phone();
	  demo.male();
	  demo.hobbies();
	  demo.scrollToBottom();
	  demo.clicklanguage();
	  demo.selectlanguage();
	  demo.scrollfunction();
      demo.hobbies1();
      demo.selectcountry();
      demo.searchcountry();
      demo.selectindia();
      demo.Day();
      demo.Year();
  }

}

