package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {
	public static WebDriver test()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
	 return	driver;
		
	}
	
	public void test1(WebDriver driver) throws InterruptedException
	{
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		name.sendKeys("sunilmunde");
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		 action.keyDown(Keys.CONTROL);
		 action.sendKeys("c");
		 action.keyUp(Keys.CONTROL);
		 action.sendKeys(Keys.TAB);
		 action.keyDown(Keys.CONTROL);
		 action.sendKeys("v");
		 action.keyUp(Keys.CONTROL);
		 action.build().perform();
		 Thread.sleep(2000);

		 action.sendKeys(Keys.TAB);

		//action.keyDown(Keys.CONTROL);
		 action.sendKeys("munde");
		//action.keyUp(Keys.CONTROL);
		action.sendKeys(Keys.TAB);
		action.sendKeys("velecity");
		action.build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//BUTTON[@id='submit']")).click();
		 
		 
		 
		 
	}	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=	Keyboardaction.test();
		Keyboardaction obj=new Keyboardaction();
		obj.test1(driver);

		
		
		
	}
		 
		 
		 
		

}