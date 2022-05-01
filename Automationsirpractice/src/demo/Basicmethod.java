package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Basicmethod {
	
	public static WebDriver test()
	{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
      driver.get("http://demo.guru99.com/popup.php");
	//(guru99 click buuton)
      driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	return driver;
	
	}
	   
	public static void Screenshot(WebDriver driver, String a) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest= new File("D:\\SCREENSHOT\\sss.jpg"+a+".png");
		FileHandler.copy(source,Dest);
	}
	public static void main(String[] args) throws IOException  {
	WebDriver driver=Basicmethod.test();
	//	Basicmethod.Screenshot(driver);
		
		//http://demo.guru99.com/popup.php
		
	}

}
