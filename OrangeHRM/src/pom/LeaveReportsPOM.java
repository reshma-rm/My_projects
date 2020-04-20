package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeaveReportsPOM {
	
	public static WebElement leaveButton(WebDriver driver) {
		return driver.findElement(By.id("menu_leave_viewLeaveModule"));
		
	}
	public static WebElement ReportsBtn(WebDriver driver) {
		return driver.findElement(By.id("menu_leave_Reports"));
		
	}
	
	public static WebElement leaveRepBtn(WebDriver driver) {
		return driver.findElement(By.id("menu_leave_viewLeaveBalanceReport"));
		
	}
	
	public static WebElement generateFor(WebDriver driver) {
		return driver.findElement(By.id("leave_balance_report_type"));
		
	}
	
	public static WebElement leaveType(WebDriver driver) {
		return driver.findElement(By.id("leave_balance_leave_type"));
		
	}
	
	public static WebElement from(WebDriver driver) {
		return driver.findElement(By.id("period"));
	}
	
	public static WebElement jobTitle(WebDriver driver) {
		return driver.findElement(By.id("leave_balance_job_title"));
	}
	
	public static WebElement location(WebDriver driver) {
		return driver.findElement(By.id("leave_balance_location"));
	}
	
	public static WebElement subUnit(WebDriver driver) {
		return driver.findElement(By.id("leave_balance_sub_unit"));
	}
	
	public static WebElement viewButton(WebDriver driver) {
		return driver.findElement(By.id("viewBtn"));
	}
	

}
