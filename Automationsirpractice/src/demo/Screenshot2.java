package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {

	public static WebDriver test() {
		
		
   System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
   		
     WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      return driver;
	}
	public static void main(String[] args) {
		Screenshot2.test();
		
	}

}
