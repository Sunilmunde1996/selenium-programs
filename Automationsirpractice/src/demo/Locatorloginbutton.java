package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorloginbutton {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
  //   WebElement aa=driver.findElement(By.tagName("button"));
     //aa.click();
	WebElement cc=driver.findElement(By.id("email"));
	cc.sendKeys("sunilmunde");
	WebElement dd=driver.findElement(By.name("pass"));
	dd.sendKeys("Arjun12@");
	//WebElement bb=driver.findElement(By.name("login"));
		//bb.click();
	//WebElement ee=driver.findElement(By.id("u_0_d_nr"));
//	ee.click();
	WebElement ff= driver.findElement(By.cssSelector("[type=submit]"));
	ff.click();//by using cssselector
	//WebElement gg=driver.findElement(By.cssSelector("[value=1]"));//cssselector value not used
	//gg.click();
	
	
	}

}
