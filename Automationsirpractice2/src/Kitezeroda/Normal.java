package Kitezeroda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
//	driver.findElement(By.xpath(""));
	
	

	}

}
