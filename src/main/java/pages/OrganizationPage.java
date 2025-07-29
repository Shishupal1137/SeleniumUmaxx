package pages;

import org.testng.Reporter;

import common.BasesetupQuickDev;
import common.SafeActionsQuickDev;

public class OrganizationPage extends SafeActionsQuickDev{
	
	 String clickonNameLoc = "//p[text()= 'Shishupal Singh']";
	String OrginizationLoc = "//span[text() = 'Organization']";
	String EnterDescriptionLoc = "//label[text() = 'Description']//following::textarea[1]";
	String PhonenumLoc = "//label[text() = 'Phone']//following::input[1]";
	String SaveButtonLoc = "(//button[text() = ' Save '])[2]";
	String SavebuttonLoc = "(//button[text() = ' Save '])[1]";
	String UploadLogoLoc = "//button[text() = ' Upload Logo ']";
	String ImageUploadLoc = "//input[@type = 'file']";
	
	
	public void clickonNnameFun() {
		safeExplicitWait(clickonNameLoc, SHORTWAIT);
		safeClick(clickonNameLoc);
		Reporter.log("Succesfully click on user name");
		BasesetupQuickDev.infoLog(clickonNameLoc);
	}
	
	public void clickOnOrganizationFun() {
		safeExplicitWait(OrginizationLoc, NORAMALWAIT);
		safeClick(OrginizationLoc);
		Reporter.log("succesfully click on orgnization page",true);
		BasesetupQuickDev.infoLog("succesfully click on orgnization page");
	}
	
public void descriptionFun() {
	safeExplicitWait(EnterDescriptionLoc, NORAMALWAIT);
	safeType(EnterDescriptionLoc, "Innovation world");
	Reporter.log("succesfully entered description",true);
	BasesetupQuickDev.infoLog("succesfully entered description");
}
	public void phonenumLoc() {
		safeExplicitWait(PhonenumLoc, LONGWAIT);
		safeType(PhonenumLoc, "9555537343");
		Reporter.log("succesfully entered phone number",true);
		BasesetupQuickDev.infoLog("succesfully entered phone number");
	}
 
  
  public void uploadbuttonFun() {
	  safeExplicitWait(UploadLogoLoc, NORAMALWAIT);
	  safeClick(UploadLogoLoc);
	  Reporter.log("succesfully Click On Upload logo button",true);
	  BasesetupQuickDev.infoLog("succesfully Click On Upload logo button");
  }
  
  public void imageUploadFun() {
	  safeExplicitWait(ImageUploadLoc, NORAMALWAIT);
	  safeType(ImageUploadLoc, "C:\\Users\\shish\\OneDrive\\Pictures\\sample.jpg");
	  Reporter.log("succesfully upload Image",true);
	  BasesetupQuickDev.passLog("succesfully upload Image");
  }
  public void savebuttonFun() {
	  safeExplicitWait(SaveButtonLoc, NORAMALWAIT);
	  safeClick(SaveButtonLoc);
	  Reporter.log("succesfully saved Data",true);  
	  BasesetupQuickDev.passLog("Succesfully saved Data");
	  
  }
  public void saveButtonFun() {
	  safeExplicitWait(SavebuttonLoc, NORAMALWAIT);
	  safeClick(SavebuttonLoc);
	  Reporter.log("succesfully saved Data",true);  
	  BasesetupQuickDev.passLog("Succesfully saved Data");
	  
  }
  
  public void imageUploadPngFun() {
	  safeExplicitWait(ImageUploadLoc, NORAMALWAIT);
	  safeType(ImageUploadLoc, "C:\\Users\\shish\\OneDrive\\Pictures\\mk.png");
	  Reporter.log("succesfully upload Image",true);
	  BasesetupQuickDev.passLog("succesfully upload Image");
  }
  
  public void imageUploadGifFun() {
	  safeExplicitWait(ImageUploadLoc, NORAMALWAIT);
	  safeType(ImageUploadLoc, "C:\\Users\\shish\\OneDrive\\Pictures\\kcm.gif");
	  Reporter.log("succesfully upload Image",true);
	  BasesetupQuickDev.passLog("succesfully upload Image");
 
  }
}
