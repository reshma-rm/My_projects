package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlightSearch {
    @Test
	public static void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Hamada\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.navigate().to("http://newtours.demoaut.com/");
        
        
        WebElement userName=driver.findElement(By.name("userName"));
        userName.sendKeys("az123az");
        
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("arafaz@123");
        
        WebElement submitButton=driver.findElement(By.name("login"));
        submitButton.click();
        
        WebElement typeOneWay=driver.findElement(By.name("tripType"));
        typeOneWay.click();
        
        WebElement personNum=driver.findElement(By.name("passCount"));
        Select select1=new Select(personNum);
        select1.selectByVisibleText("1");
        
        WebElement depart=driver.findElement(By.name("fromPort"));
        Select select2=new Select(depart);
        select2.selectByVisibleText("London");
        
        WebElement onMonth=driver.findElement(By.name("fromMonth"));
        Select select4=new Select(onMonth);
        select4.selectByVisibleText("June");
        
        WebElement onDay=driver.findElement(By.name("fromDay"));
        Select select5=new Select(onDay);
        select5.selectByVisibleText("1");
        
        WebElement arrivingIn=driver.findElement(By.name("toPort"));
        Select select6=new Select(arrivingIn);
        select6.selectByVisibleText("Paris");
        
        WebElement returnMonth=driver.findElement(By.name("toMonth"));
        Select select7=new Select(returnMonth);
        select7.selectByVisibleText("July");
        
        WebElement returnDay=driver.findElement(By.name("toDay"));
        Select select8=new Select(returnDay);
        select8.selectByVisibleText("1");
        
        WebElement serviceClass=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"));
        serviceClass.click();
        
        WebElement airline=driver.findElement(By.name("airline"));
        Select select9=new Select(airline);
        select9.selectByVisibleText("Blue Skies Airlines");
        
        Thread.sleep(3000);
        
        WebElement continueClick=driver.findElement(By.name("findFlights"));
        continueClick.click();
        
        driver.close();

	}

}
