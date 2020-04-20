package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.LeaveReportsPOM;
import pom.LoginPageObjectModel;

public class LeaveReports {
	@Test
	public void leaveReport() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Hamada\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
		LoginPageObjectModel.userName(driver).sendKeys("Admin");
		LoginPageObjectModel.password(driver).sendKeys("admin123");
		LoginPageObjectModel.loginbtn(driver).click();
		
		LeaveReportsPOM.leaveButton(driver).click();
		LeaveReportsPOM.ReportsBtn(driver).click();
		LeaveReportsPOM.leaveRepBtn(driver).click();
		Select genFor=new Select(LeaveReportsPOM.generateFor(driver));
		genFor.selectByVisibleText("Leave Type");
		Select type=new Select(LeaveReportsPOM.leaveType(driver));
		type.selectByVisibleText("FMLA US");
		Select fromToDate=new Select(LeaveReportsPOM.from(driver));
		fromToDate.selectByIndex(0);
		Select jobTitle=new Select(LeaveReportsPOM.jobTitle(driver));
		jobTitle.selectByVisibleText("All");
		Select location=new Select(LeaveReportsPOM.location(driver));
		location.selectByVisibleText("All");
		Select subUnit=new Select(LeaveReportsPOM.subUnit(driver));
		subUnit.selectByVisibleText("All");
		LeaveReportsPOM.viewButton(driver).click();
	}

}
