package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
	
	
	public static WebDriver brower()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	return driver;
	}
	
	public void test(WebDriver driver) throws InterruptedException
	{
	driver.switchTo().frame	(driver.findElement(By.xpath("(//iframe[@height='500'])[1]")));
	WebElement imag=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement imag1=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
	Actions action=new Actions(driver);
	action.dragAndDrop(imag, imag1).perform();
	Thread.sleep(2000);
	WebElement imag2=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement imag3=driver.findElement(By.xpath("//ul[@id=\"gallery\"]"));
	action.dragAndDrop(imag2, imag3).perform();

	
	
      }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	Mouseaction.brower();
		Mouseaction obj=new Mouseaction();
		obj.test(driver);
	
	}	
	}
	
