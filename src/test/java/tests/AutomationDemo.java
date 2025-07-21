package tests;

import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class AutomationDemo {
    private WebDriver driver;
    
    public static void main(String[] args) throws InterruptedException {
        AutomationDemo demo = new AutomationDemo();
        demo.setUp();  // Manual setup when running via main()
        // Add your test steps here
        demo.closeBrowser();  // Manual cleanup
    }
    
    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    
    @Test(priority = 1, enabled = false)

    public void verifyhomepagefunctionality() throws Exception {
    	driver.findElement(By.xpath("//input[@placeholder ='First Name']")).sendKeys("shishupal");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@placeholder ='Last Name']")).sendKeys("singh");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//textarea[@ng-model ='Adress']")).sendKeys("Indore");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("shishupalsingh1123@gmail.com");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@ng-model = 'Phone']")).sendKeys("9555537345");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@value = 'Male']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@value = 'Cricket']")).click();
     	Thread.sleep(2000);
     	
     	
     	JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("window.scrollBy(0, 500)"); // Scroll down 500 pixels
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//div[@id = 'msdd']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[text() = 'Arabic']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//label[text() = 'Skills']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//select[@id ='Skills']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//option[text() = 'C++']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//span[@role = 'combobox']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//input[@type = 'search']")).sendKeys("ind");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//li[text() = 'India']")).click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
    	js1.executeScript("window.scrollBy(0, -500)"); // Scrolls up by 500 pixels
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//input[@id = 'imagesrc']")).sendKeys("C:\\Users\\shish\\OneDrive\\Pictures\\wave.jpg");
    	Thread.sleep(2000);
    }
    
    
    
    
    @Test(priority = 2, enabled = false)
    public void verifyswitchTopageFunctionality() throws Exception {
    	driver.findElement(By.xpath("//a[text() = 'SwitchTo']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//a[text() = 'Alerts']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[@onclick = 'alertbox()']")).click();
    	Thread.sleep(2000);
    	
    	Alert alert = driver.switchTo().alert();
        alert.accept(); 
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("(//a[@class = 'analystic'])[2]")).click();
    	Thread.sleep(2000);
    	
    	
    	  driver.findElement(By.xpath("//button[@onclick = 'confirmbox()']")).click();
      	Thread.sleep(2000);
      	
      	 Alert alert1 = driver.switchTo().alert();

         // Step 3: Click "Cancel" (dismiss the alert)
         alert1.dismiss();
     	Thread.sleep(2000);
     	
     	  driver.findElement(By.xpath("(//a[@data-toggle = 'tab'])[3]")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//button[@class = 'btn btn-info']")).click();
         Thread.sleep(2000);
     	
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());
         
         // 3. Enter text "Raja" into the prompt
         promptAlert.sendKeys("Raja");
         Thread.sleep(2000);
         // 4. Click OK to accept
         promptAlert.accept();
         Thread.sleep(2000);   
      }
    @Test(priority = 3)
    public void verifywidgetsSkiderfunctionality() throws Exception {
    	driver.findElement(By.xpath("//a[text() = 'Widgets']")).click();
    	 Thread.sleep(2000);   
    	 
    	 driver.findElement(By.xpath("//a[text() = ' Slider ']")).click();
    	 Thread.sleep(2000); 
    	 
    	 WebElement slider = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));

    	// Create Actions instance
    	Actions move = new Actions(driver);

    	// Move the slider to the right by 50 pixels (you can adjust this value)
    	move.clickAndHold(slider).moveByOffset(50, 0).release().perform();
    	Thread.sleep(2000);
    	 
    }
    
    
    
    
    
    
    @AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}