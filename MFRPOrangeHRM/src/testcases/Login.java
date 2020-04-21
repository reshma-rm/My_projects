package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.LoginPOM;

public class Login {
	static Logger logger=Logger.getLogger(Login.class);
	@Test
	public void login() throws IOException {
		
		WebDriver driver=null;
		FileInputStream stream=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(stream);
		
		String Location=properties.getProperty("location");
		String MainURL=properties.getProperty("mainURL");
		String Usrname=properties.getProperty("Username");
		String Password=properties.getProperty("Password");
		
		PropertyConfigurator.configure("config.properties");
		
		System.setProperty("webdriver.chrome.driver", Location);
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.navigate().to(MainURL);
		
		PageFactory.initElements(driver, LoginPOM.class);
		
		LoginPOM.forgotPassword.click();
		LoginPOM.cancelButton.click();
		
		LoginPOM.userName.sendKeys(Usrname);
		LoginPOM.password.sendKeys(Password);
		LoginPOM.loginButton.click();
		
		if(LoginPOM.logo.getAttribute("naturalHeight").equals("0")) 
			logger.error("Logo is broken");
			else
				logger.info("Logo is not broken");
		
		
		
		
		driver.close();
		
		
		
		
	}

}
