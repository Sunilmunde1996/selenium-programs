package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatoremailidfield {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32//chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//WebElement w=driver.findElement(By.name("email"));by using name locator
	//w.sendKeys("sunil");
	
	//WebElement ii=driver.findElement(By.id("email"));//by using id locator
	//	ii.sendKeys("sunilmunde1996@gmail.com");
		
	//	WebElement zz=driver.findElement(By.tagName("input")); // in this seven record after searching takes place
		//zz.sendKeys("munde");
	
		//WebElement xx=driver.findElement(By.className("email"));//not uniqe record
	//	xx.sendKeys("somnathmunde1993@gmail.com");
		
		//WebElement vv= driver.findElement(By.cssSelector("[name='email']"));
		//vv.sendKeys("dada");
		WebElement uu= driver.findElement(By.cssSelector("[placeholder='Email address or phone number']"));
         uu.sendKeys("aai");
	}

	}


