package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.LoginPOMWithPageFactory;

public class LoginWithPAgeFactory {
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Hamada\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginPOMWithPageFactory.class);
		
		LoginPOMWithPageFactory.username.sendKeys("Admin");
		LoginPOMWithPageFactory.password.sendKeys("admin123");
		LoginPOMWithPageFactory.loginbutton.click();
	}

}
