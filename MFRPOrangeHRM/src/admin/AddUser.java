package admin;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.AdminPOM;
import pom.LoginPOM;


public class AddUser {

	static Logger logger=Logger.getLogger(AddUser.class);
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
		String UserNameGiven=properties.getProperty("UserName");
		PropertyConfigurator.configure("config.properties");
		
		System.setProperty("webdriver.chrome.driver", Location);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.navigate().to(MainURL);
		
		PageFactory.initElements(driver, LoginPOM.class);
		PageFactory.initElements(driver, AdminPOM.class);
		//Login Part
		LoginPOM.userName.sendKeys(Usrname);
		LoginPOM.password.sendKeys(Password);
		LoginPOM.loginButton.click();
		
		//Adding User Part
		AdminPOM.adminButton.click();
		AdminPOM.clickAdd.click();
		AdminPOM.cancelUserButton.click();
		
	
	    //Reading from Excel File
		String excelPathADDUser=properties.getProperty("excelPath");
		FileInputStream excel=new FileInputStream(excelPathADDUser);
		Workbook wb1=new XSSFWorkbook(excel);
		Sheet sheet1=wb1.getSheetAt(0); 
		for(int i=1; i<4; i++) {
			AdminPOM.clickAdd.click();
			//Import UserRole
			Cell cellUserRole= sheet1.getRow(i).getCell(0);
			Select role=new Select(AdminPOM.userRole);
			role.selectByVisibleText(cellUserRole.getStringCellValue());
			
			//Import User Name
			Cell cellUserName= sheet1.getRow(i).getCell(1);
			AdminPOM.empName.sendKeys(cellUserName.getStringCellValue() +Keys.ENTER);
			
			//Import Employee Name
			Cell cellUsernameofEmp=sheet1.getRow(i).getCell(2);
			AdminPOM.userNameofEmp.sendKeys(cellUsernameofEmp.getStringCellValue());
			
			//Import Status
			Cell cellStatus=sheet1.getRow(i).getCell(3);
			Select status=new Select(AdminPOM.userStatus);
			status.selectByVisibleText(cellStatus.getStringCellValue());
			
			//Import Password
			Cell cellPassword=sheet1.getRow(i).getCell(4);
			AdminPOM.userPassword.sendKeys(cellPassword.getStringCellValue());
			
			//Import Confirm Password
			Cell cellConfPassword=sheet1.getRow(i).getCell(5);
			AdminPOM.confirmPassword.sendKeys(cellConfPassword.getStringCellValue());
			
			AdminPOM.saveButton.click();
			logger.info("Added User successfully");
		}
		wb1.close();
		
		//Search for user from List
		
		AdminPOM.searchWithUserName.sendKeys(UserNameGiven);
		AdminPOM.searchUserclick.click();  
		logger.info("Search user done");
		AdminPOM.resetSearch.click();
		logger.info("Reset done");
		driver.close();
		
	}
}
