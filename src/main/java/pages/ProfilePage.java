package pages;

import org.testng.Reporter;

import common.BasesetupQuickDev;
import common.SafeActionsQuickDev;

public class ProfilePage extends SafeActionsQuickDev{
	
    String clickonNameLoc = "//p[text()= 'Shishupal Singh']";
    
    
    
	String  ClickOnProfileLoc = "//span[text() = 'Profile']";
	String  ClickOnUpdateProfileLoc = "//button[text() = ' Update Profile ']";
	String  ChooseImageLoc = "//input[@id = 'imageId']";
	String  SaveButtonLoc = "(//button[text() = ' Save '])[2]";
	String  ValidationLoc = "//span[text() = ' File is uploaded successfully. ']";
	
	
	
	public void clickonNameFun() {
		safeExplicitWait(clickonNameLoc, LONGWAIT);
		safeClick(clickonNameLoc);
		Reporter.log("Succesfully click on user name");
		BasesetupQuickDev.infoLog(clickonNameLoc);
	}
	
	public void clickonProfileFun() {
		safeExplicitWait(ClickOnProfileLoc, NORAMALWAIT);
		safeClick(ClickOnProfileLoc);
		Reporter.log("Succesfully Click On Profile",true);
	    BasesetupQuickDev.infoLog("Succesfully Click On Profile");
	}
   public void clickProfileUpdateFun() {
	   safeExplicitWait(ClickOnUpdateProfileLoc, NORAMALWAIT);
	   safeClick(ClickOnUpdateProfileLoc);
	   Reporter.log("Succesfully Click On Update Profile",true);
	   BasesetupQuickDev.infoLog("Succesfully Click On Update Profile");
   }
   public void chooseImageFun() {
	   safeExplicitWait(ChooseImageLoc, NORAMALWAIT);
	   safeType(ChooseImageLoc, "C:\\Users\\shish\\OneDrive\\Pictures//wave.jpg");
	   Reporter.log("Succesfully Choose image",true);
	   BasesetupQuickDev.passLog("Succesfully Choose image");
   }
   public void saveButtonFun() {
	   safeExplicitWait(SaveButtonLoc, LONGWAIT);
	   safeClick(SaveButtonLoc);
	   Reporter.log("Succesfully Saved Image",true);
	   BasesetupQuickDev.passLog("Succesfully Saved Image");
   }
   public void chooseImagePngFun() {
	   safeExplicitWait(ChooseImageLoc, NORAMALWAIT);
	   safeType(ChooseImageLoc, "C:\\Users\\shish\\OneDrive\\Pictures\\view.png");
	   Reporter.log("Succesfully Choose image",true);
	   BasesetupQuickDev.passLog("Succesfully Choose png image");
   }
   public void chooseImageGifFun() {
	   safeExplicitWait(ChooseImageLoc, NORAMALWAIT);
	   safeType(ChooseImageLoc, "C:\\Users\\shish\\OneDrive\\Pictures\\cmp.gif");
	   Reporter.log("Succesfully Choose image",true);
	   BasesetupQuickDev.passLog("Succesfully Choose Gif image");
   }
   public void chooseImageJfifFun() {
	   safeExplicitWait(ChooseImageLoc, NORAMALWAIT);
	   safeType(ChooseImageLoc, "C:\\Users\\shish\\OneDrive\\Pictures\\bmc.jfif");
	   Reporter.log("Succesfully Choose image",true);
	   BasesetupQuickDev.passLog("Succesfully Choose jfif image");
   }
   public void validationFun() {
	   safeExplicitWait(ValidationLoc, NORAMALWAIT);
	   safeIsDisplayed(ValidationLoc);
	  // Reporter.log("Succesfully Print validation message",true);
	 //  BasesetupQuickDev.passLog("Succesfully Print validation message");
   }
   
}
