package demo;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Source;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot11 {
	
	public static WebDriver test()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://corporate.spicejet.com/forexservices.aspx");
		return driver;
	}
	public static  void screenshot(WebDriver driver) throws IOException
	{
	 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("D:\\SCREENSHOT\\spicejet.jpg");
	FileHandler.copy(source,dest);
	
	}
	
	


}