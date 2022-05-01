package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicmethod {
	
	
	public static WebDriver test1(String url)
	     {
         System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");	
          WebDriver driver=new ChromeDriver();
	      driver.get(url);
	       return driver;
	       }
	
     



}
