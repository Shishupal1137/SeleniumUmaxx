
package pages;

import org.testng.Reporter;

import common.BasesetupQuickDev;
import common.SafeActionsQuickDev;

public class AppPage extends SafeActionsQuickDev {
   String ApplicationLoc = "//div[text() = 'Applications']";
   String AddApplicationLoc = "//button[text() = ' Add ']";
   String NameApplicationLoc = "(//input[@placeholder  ='Name'])[2]";
   String ApplicationUrlLoc = "(//input[@placeholder  ='Enter URL'])";
   String StatusLoc = "//option[text() = 'Draft']";
   String SaveButtonLoc = "//button[text() = ' Save ']";
   
   String RolesLoc = "//button[@title = 'Role']";
   String AddRolesLoc = "(//button[text() = ' Add '])[2]";
   String RolenameLoc = "//th[text() = ' Role Name ']//following::input[1]";
   String SaveRoleLoc = "//button[@title = 'New Record Add']";
   String EditRoleLoc = "//span[text() = 'Doctor']//following::button[1]";
   String saveeditRoleLoc = "//button[@title = 'Update Changes']";
   String DeleteRoleLoc = "//span[text() = 'patient']//following::button[2]";
   
   public void applicationFun() {
	   safeExplicitWait(ApplicationLoc, NORAMALWAIT);
	   safeClick(ApplicationLoc);
	   Reporter.log("succesfully click On application page",true);	   
	   BasesetupQuickDev.infoLog("succesfully click On application page");
   }
   public void addApplicationFun() {
	   safeExplicitWait(AddApplicationLoc, NORAMALWAIT);
	   safeClick(AddApplicationLoc);
	   Reporter.log("Succesfully Click On Add Application",true);
	   BasesetupQuickDev.infoLog("Succesfully Click On Add Application");
   }
   public void nameApplicationFun() {
	   safeExplicitWait(NameApplicationLoc, NORAMALWAIT);
	   safeType(NameApplicationLoc, "CareSync");
	   Reporter.log("succesfully Enter Application name",true);
	   BasesetupQuickDev.infoLog("succesfully Enter Application name");
   }
   public void ApplicationUrlFun () {
	   safeExplicitWait(ApplicationUrlLoc, NORAMALWAIT);
	   safeType(ApplicationUrlLoc,"www.CareSync.com");
	   Reporter.log("succesfully Enter Url for application",true);
	   BasesetupQuickDev.infoLog("succesfully Enter Url for application");
   }
   public void statusFun() {
	   safeExplicitWait(StatusLoc, NORAMALWAIT);
	   safeClick(StatusLoc);
	   Reporter.log("Succesfully marked Draft Status",true);
	   BasesetupQuickDev.infoLog("Succesfully marked Draft Status");
   }
   public void SavebuttonLoc() {
	   safeExplicitWait(SaveButtonLoc, NORAMALWAIT);
	   safeClick(SaveButtonLoc);
	   Reporter.log("succesfully click on save button",true);
	   BasesetupQuickDev.passLog("succesfully click on save button");
   }
   public void clearApplicationName() {
	    safeExplicitWait(NameApplicationLoc, NORAMALWAIT);
	    safeClear(NameApplicationLoc);
	    Reporter.log("Successfully cleared Application Name", true);
	    BasesetupQuickDev.infoLog("Successfully cleared Application Name");
	}
    public void RolesFun() {
    	safeExplicitWait(RolesLoc, NORAMALWAIT);
    	safeClick(RolesLoc);
    	Reporter.log("successfully click on roles",true);
    	BasesetupQuickDev.infoLog("successfully click on roles");
    }
    
    public void AddRolesFun() {
    	safeExplicitWait(AddRolesLoc, NORAMALWAIT);
    	safeClick(AddRolesLoc);
    	Reporter.log("succesfully click On add role",true);
    	BasesetupQuickDev.infoLog("succesfully click On add role");
    }
    public void rolenameFun() {
    	safeExplicitWait(RolenameLoc, NORAMALWAIT);
    	safeType(RolenameLoc, "Doctor");
    	Reporter.log("succesfully enter role name",true);
    	BasesetupQuickDev.infoLog("succesfully enter role name");
    }
    public void saveroleFun() {
    	safeExplicitWait(SaveRoleLoc, NORAMALWAIT);
    	safeClick(SaveRoleLoc);
    	Reporter.log("succesfully click on save role",true);
    	BasesetupQuickDev.infoLog("succesfully click on save role");
    }
    public void editRoleFun() {
    	safeExplicitWait(EditRoleLoc, NORAMALWAIT);
    	safeClick(EditRoleLoc);
    	Reporter.log("succesfully click on edit role",true);
    	BasesetupQuickDev.infoLog("succesfully click on edit role");
    	
    	
    }
    public void clearRolenameFun() {
    	safeExplicitWait(RolenameLoc, NORAMALWAIT);
    	safeClear(RolenameLoc);
    	Reporter.log("succesfully clear role name succesfully",true);
    	BasesetupQuickDev.infoLog("succesfully clear role name succesfully");
    }
    public void roleeditnameFun() {
    	safeExplicitWait(RolenameLoc, NORAMALWAIT);
    	safeType(RolenameLoc, "patient");
    	Reporter.log("succesfully enter role name",true);
    	BasesetupQuickDev.infoLog("succesfully enter role name");
    }
    public void EditFieldFun() {
    	safeExplicitWait(saveeditRoleLoc, NORAMALWAIT);
    	safeClick(saveeditRoleLoc);
    	Reporter.log("succesfully save edit role",true);
    	BasesetupQuickDev.infoLog("succesfully save edit role");
    }
    public void DeleteRoleFun() {
    	safeExplicitWait(DeleteRoleLoc, NORAMALWAIT);
    	safeClick(DeleteRoleLoc);
    	Reporter.log("succesfully Role deleted",true);
    	BasesetupQuickDev.passLog("succesfully Role deleted");
    }
}




