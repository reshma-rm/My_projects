package pom;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmpPOMWithPageFActory {
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
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
	//*[@id="menu_admin_viewAdminModule"]/b
}






