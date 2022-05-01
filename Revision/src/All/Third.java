package All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Third {
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforemethod()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\All application\\selenium\\bbbb\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement jio=driver.findElement(By.xpath("//div[text()='Login']"));
         jio.click();
 		WebElement jio1=driver.findElement(By.xpath("//input[@type=\"number\"]"));
        jio1.sendKeys("9834047688");
	}
	
	
	@Test(enabled=false)
	public void test()
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\All application\\selenium\\bbbb\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.spicejet.com/");
		//WebElement jio=driver.findElement(By.xpath("//div[text()='Login']"));
	    // jio.click();
		//WebElement jio1=driver.findElement(By.xpath("//input[@type=\"number\"]"));
       // jio1.sendKeys("9834047688");
		

		
	}
	
	
	
	@Test(priority=0)
	public void rr() {
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Arjun12@");
	}
	
	
	
	
	
	

	

		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

