package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPOM {
//Adding User
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]")
	public static WebElement adminButton;
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewSystemUsers\"]")
	public static WebElement userButton;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement clickAdd;
	
	@FindBy(xpath="//*[@id=\"systemUser_userType\"]")
	public static WebElement userRole;
	
	@FindBy(xpath="//*[@id=\"systemUser_employeeName_empName\"]")
	public static WebElement empName;
	
	@FindBy(xpath="//*[@id=\"systemUser_userName\"]")
	public static WebElement userNameofEmp;
	
	@FindBy(xpath="//*[@id=\"systemUser_status\"]")
	public static WebElement userStatus;
	
	@FindBy(xpath="//*[@id=\"systemUser_password\"]")
	public static WebElement userPassword;
	
	@FindBy(xpath="//*[@id=\"systemUser_confirmPassword\"]")
	public static WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement saveButton;
	
	@FindBy(xpath="//*[@id=\"btnCancel\"]")
	public static WebElement cancelUserButton;
	
	@FindBy(id="searchBtn")
	public static WebElement searchUserclick;
	
	@FindBy(id="searchSystemUser_userName")
	public static WebElement searchWithUserName;
	
	@FindBy(id="resetBtn")
	public static WebElement resetSearch;
	
	
	
	
}

