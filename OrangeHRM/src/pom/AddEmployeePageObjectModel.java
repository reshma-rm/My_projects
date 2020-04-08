package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployeePageObjectModel {

	public static WebElement adminButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
	}
	
	public static WebElement userButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
	}
	//
	public static WebElement clickAdd(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));
	}
	public static WebElement userRole(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"systemUser_userType\"]"));
	}
	
	public static WebElement empName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]"));
	}
	
	public static WebElement userNameofEmp(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]"));
	}
	
	public static WebElement userStatus(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]"));
	}
	public static WebElement userPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]"));
	}
	public static WebElement confirmPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]"));
	}
	
	public static WebElement saveButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
	}
}
