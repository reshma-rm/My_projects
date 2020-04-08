package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.AddEmployeePageObjectModel;
import pom.LoginPageObjectModel;

public class AddEmployee {
	@Test
	public static void addUser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Hamada\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
		LoginPageObjectModel.userName(driver).sendKeys("Admin");
		LoginPageObjectModel.password(driver).sendKeys("admin123");
		LoginPageObjectModel.loginbtn(driver).click();
		
		AddEmployeePageObjectModel.adminButton(driver).click();
		AddEmployeePageObjectModel.clickAdd(driver).click();
		Select getESS=new Select(AddEmployeePageObjectModel.userRole(driver));
		getESS.selectByVisibleText("ESS");
		AddEmployeePageObjectModel.empName(driver).sendKeys("John Smith"+Keys.ENTER);
		AddEmployeePageObjectModel.userNameofEmp(driver).sendKeys("smith.smith123");
		Select userStat=new Select(AddEmployeePageObjectModel.userStatus(driver));
		userStat.selectByVisibleText("Enabled");
		AddEmployeePageObjectModel.userPassword(driver).sendKeys("smith2020@123");
		AddEmployeePageObjectModel.confirmPassword(driver).sendKeys("smith2020@123");
		AddEmployeePageObjectModel.saveButton(driver).click();

		
	}

}
