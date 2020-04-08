package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.AddEmpPOMWithPageFActory;
import pom.LoginPOMWithPageFactory;

public class AddEmployeeWithPageFactory {
	@Test
	public void AddEmp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Hamada\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginPOMWithPageFactory.class);
		PageFactory.initElements(driver, AddEmpPOMWithPageFActory.class);
		
		LoginPOMWithPageFactory.username.sendKeys("Admin");
		LoginPOMWithPageFactory.password.sendKeys("admin123");
		LoginPOMWithPageFactory.loginbutton.click();
		
		AddEmpPOMWithPageFActory.adminButton.click();
		//AddEmpPOMWithPageFActory.userButton.click();
		AddEmpPOMWithPageFActory.clickAdd.click();
		Select role=new Select(AddEmpPOMWithPageFActory.userRole);
		role.selectByVisibleText("ESS");
		AddEmpPOMWithPageFActory.empName.sendKeys("Russel Hamilton"+Keys.ENTER);
		AddEmpPOMWithPageFActory.userNameofEmp.sendKeys("hamilton.hamada.russel");
		Select stat=new Select(AddEmpPOMWithPageFActory.userStatus);
		stat.selectByVisibleText("Enabled");
		AddEmpPOMWithPageFActory.userPassword.sendKeys("Hamilton@123");
		AddEmpPOMWithPageFActory.confirmPassword.sendKeys("Hamilton@123");
		AddEmpPOMWithPageFActory.saveButton.click();
		
	}

}
