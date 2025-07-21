/*package tests;

import org.testng.annotations.Test;

import common.BasesetupQuickDev;

public class Profile extends BasesetupQuickDev {
  @Test
  public void VerifyProfileFunctionality() {
	 
	 ProfilePage profilepage = new ProfilePage();
	  
  }
}*/
package tests;

import org.testng.annotations.Test;
import common.BasesetupQuickDev;
import pages.ProfilePage; // Ensure this import is correct

public class ProfileTest extends BasesetupQuickDev {
  
  @Test(priority = 1)
  public void VerifyProfileFunctionality() {
    // Creating an instance of ProfilePage
    ProfilePage profilepage = new ProfilePage();
    
    profilepage.clickonNameFun();
    profilepage.clickonProfileFun();
    profilepage.clickProfileUpdateFun();
    profilepage.chooseImageFun();
    profilepage.saveButtonFun();
    profilepage.validationFun();
  }
  
  @Test(enabled = false , priority = 2)
  public void VerifyProfilePngFunctionality() {
    // Creating an instance of ProfilePage
    ProfilePage profilepage = new ProfilePage();
    profilepage.clickProfileUpdateFun();
    profilepage.chooseImagePngFun();
    profilepage.saveButtonFun();
}
  
  @Test(enabled = false , priority = 3)
  public void VerifyProfileGifFunctionality() {
    // Creating an instance of ProfilePage
    ProfilePage profilepage = new ProfilePage();
    profilepage.clickProfileUpdateFun();
    profilepage.chooseImageGifFun();
   profilepage.saveButtonFun();
}
  @Test(enabled = false , priority = 4)
  public void VerifyProfileJfifFunctionality() {
    // Creating an instance of ProfilePage
    ProfilePage profilepage = new ProfilePage();
    profilepage.clickProfileUpdateFun();
    profilepage.chooseImageJfifFun();
    profilepage.saveButtonFun();
}
}
