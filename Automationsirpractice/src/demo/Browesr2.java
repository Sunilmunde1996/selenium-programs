package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browesr2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sarathi.parivahan.gov.in/sarathiservice/stateSelection.do");
		driver.get("https://www.facebook.com/");
	}
	

}
