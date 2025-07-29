package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common.BasesetupQuickDev;
import pages.OrganizationPage;


public class OrganizationTest extends BasesetupQuickDev {
  @Test(priority = 1)
  public void varifyOrganizationPageFunctionality() throws Exception {
	  OrganizationPage orgPage = new OrganizationPage();
	  
	  orgPage.clickonNnameFun();
	  orgPage.clickOnOrganizationFun();
	  orgPage.descriptionFun();
	  orgPage.phonenumLoc();
	  
	  orgPage.uploadbuttonFun();
      orgPage.imageUploadFun();
  }
     
      //crop Image Functionality
    
    /*  Thread.sleep(5000);
      WebElement bottomRightHandle = driver.findElement(By.xpath("//span[contains(@class,'ngx-ic-resize ngx-ic-bottomright')]"));*/

      // Perform Drag & Resize using Actions class
    /*  Actions actions = new Actions(driver);
      actions.clickAndHold(bottomRightHandle)
              .moveByOffset(-50, -50) // Move handle to resize the cropped area
              .release()
              .perform();
      Thread.sleep(5000);*/

   
    //scroll Top To down
   /* Actions actions1 = new Actions(driver);
    WebElement popupBody = driver.findElement(By.cssSelector(".modal-body"));

    actions1.moveToElement(popupBody).click()
           .sendKeys(Keys.PAGE_DOWN)
           .sendKeys(Keys.PAGE_DOWN)
           .sendKeys(Keys.PAGE_DOWN)
           .perform();
    
    Thread.sleep(2000);
    
        orgPage.savebuttonFun();
        


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        orgPage.saveButtonFun();
        // down To Up
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);

  }
  
  @Test(priority = 2, enabled = false)
  public void OrganizationPagePngFunctionality() throws Exception {
	  OrganizationPage orgPage = new OrganizationPage();
	  orgPage.uploadbuttonFun();
	  orgPage.imageUploadPngFun();
	  
	//scroll Top To down
	    Actions actions1 = new Actions(driver);
	    WebElement popupBody = driver.findElement(By.cssSelector(".modal-body"));

	    actions1.moveToElement(popupBody).click()
	           .sendKeys(Keys.PAGE_DOWN)
	           .sendKeys(Keys.PAGE_DOWN)
	           .sendKeys(Keys.PAGE_DOWN)
	           .perform();
	    
	    Thread.sleep(2000);
	    orgPage.savebuttonFun();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        orgPage.saveButtonFun();
        // down To Up
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);

  }*/
  @Test(priority = 3, enabled = false)
  public void OrganizationPageGifFunctionality() throws Exception {
	  OrganizationPage orgPage = new OrganizationPage();
	  orgPage.uploadbuttonFun();
	  orgPage.imageUploadGifFun();

//scroll Top To down
	    Actions actions1 = new Actions(driver);
	    WebElement popupBody = driver.findElement(By.cssSelector(".modal-body"));

	    actions1.moveToElement(popupBody).click()
	           .sendKeys(Keys.PAGE_DOWN)
	           .sendKeys(Keys.PAGE_DOWN)
	           .sendKeys(Keys.PAGE_DOWN)
	           .perform();
	    
	    Thread.sleep(2000);
	    orgPage.savebuttonFun();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        orgPage.saveButtonFun();
        // down To Up
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);

  }
	  
  }