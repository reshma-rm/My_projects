package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SmokeTest {
    @Test
	public void main() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Hamada\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        //Home Page
        driver.navigate().to("http://newtours.demoaut.com/");
        
        //SignOn
         driver.navigate().to("http://newtours.demoaut.com/");
         WebElement clickSignon=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
         clickSignon.click();
         
         //Register
         driver.navigate().to("http://newtours.demoaut.com/");
         WebElement clickRegister=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
         clickRegister.click();
        
         //support
         driver.navigate().to("http://newtours.demoaut.com/");
         WebElement clickSupport=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
         clickSupport.click();
         
         //Contact
         driver.navigate().to("http://newtours.demoaut.com/");
         WebElement clickContact=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a"));
         clickContact.click();
         driver.close();
	}

}
