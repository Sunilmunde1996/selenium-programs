package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolldownjavascript {
	
	public void scroll(WebDriver driver)
	{
		WebElement Rest=driver.findElement(By.xpath("(//div[@style='padding:24px'])[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",Rest);
	     // This are another  method to call javaexecutor
		//JavascriptExecutor E=((JavascriptExecutor)driver);
		//E.executeScript("argument[0].scrollIntoView(true)",ccc);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=	Basicmethod.test1("https://www.w3schools.com/");
		Scrolldownjavascript obj=new Scrolldownjavascript();
		Thread.sleep(2000);
		obj.scroll(driver);
		
	}
	

}
