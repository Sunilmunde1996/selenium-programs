package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorgenrateaccount {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new  ChromeDriver();
	driver.get("https://www.facebook.com/");
	//WebElement aa=driver.findElement(By.id("email"));
	//aa.sendKeys("sunil");
	//WebElement bb=driver.findElement(By.id("pass"));
   //  bb.sendKeys("smunde");
     //WebElement cc=driver.findElement(By.cssSelector("[rel='async']")); okk
     // cc.click();	
	WebElement dd=driver.findElement(By.cssSelector("[role='button']"));
	dd.click();
	}
	
	
	

}
