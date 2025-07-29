/*package tests;

import org.testng.annotations.Test;

import common.BasesetupQuickDev;
import pages.AppPage;


public class AppTest extends BasesetupQuickDev{
	@Test
	public void verifyAppFun() {
		AppPage Apppage = new AppPage();
		AppPage.clickOnApplicationFun();
		
		
	}
	
}*/

/*package tests;

import org.testng.annotations.Test;
import common.BasesetupQuickDev;
import pages.AppPage;

public class AppTest extends BasesetupQuickDev {

    @Test
    public void verifyAppFun() {
        AppPage appPage = new AppPage(driver); // Pass driver to AppPage
        appPage.clickOnApplicationFun(); // Call the method
    }
}*/
package tests;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import common.BasesetupQuickDev;
import pages.AppPage;

public class AppTest extends BasesetupQuickDev {

    @Test(enabled = false)
    public void verifyAppFun() throws Exception {
    	String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);	
         
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        
      AppPage appPage = new AppPage(); // No need to pass driver manually
      appPage.applicationFun();
      appPage.addApplicationFun();
      appPage.nameApplicationFun();
      appPage.ApplicationUrlFun();
      appPage.statusFun();
     // appPage.SavebuttonLoc();
     appPage.clearApplicationName();
    }
    
    @Test(priority = 1, enabled = true)
    public void verifRolesFunc() {
        AppPage appPage = new AppPage();
        
        appPage.applicationFun();
        appPage.RolesFun();
        appPage.AddRolesFun();
        appPage.rolenameFun();
        /*appPage.saveroleFun();
        appPage.editRoleFun();
        appPage.clearRolenameFun();
        appPage.roleeditnameFun();
        appPage.EditFieldFun();
        appPage.DeleteRoleFun();*/

        // Handle alert after deleting role
        try {
            Alert alert = driver.switchTo().alert(); // Switch to alert
            System.out.println("Alert Text: " + alert.getText()); // Print alert text for debugging
            alert.accept(); // Click "OK" on alert
            Reporter.log("Role deleted successfully.",true);
        } catch (Exception e) {
            System.out.println("No alert found or error occurred: " + e.getMessage());
        }
    }
}