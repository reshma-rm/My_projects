package test;

import java.util.Set;

import javax.swing.text.AbstractDocument.BranchElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
    @Test
	public static void main() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Hamada\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement searchMask=driver.findElement(By.id("twotabsearchtextbox"));
        searchMask.sendKeys("Mask"+Keys.ENTER);
        
        WebElement clickTenDept=driver.findElement(By.xpath("//*[@id=\"departments\"]/ul/li[7]/span/div/a/span"));
        clickTenDept.click();
        
        WebElement faceMask=driver.findElement(By.xpath("//*[@id=\"n/1374430031\"]/span/a/span"));
        faceMask.click();
        
        WebElement starFour=driver.findElement(By.xpath("//*[@id=\"p_72/1318476031\"]/span/a/section/i"));
        starFour.click();
                
        WebElement obj = driver.findElement(By.xpath("//*[@id=\"p_89/3M\"]/span/a/div/label/i"));
        obj.click();
        driver.findElement(By.xpath("//*[@id=\"p_89/3M\"]/span/a/div/label/i")).click();
        
         driver.findElement(By.xpath("//*[@id=\"p_72/1318476031\"]/span/a/section/i")).click();
        
        
         driver.findElement(By.cssSelector("div[class='a-section a-spacing-medium']")).click();
         System.out.println(driver.findElement(By.cssSelector("div[class='a-section a-spacing-medium']")).getText());
        

	}

}
