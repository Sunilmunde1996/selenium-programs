package All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class second {
	WebDriver driver;
	
	/*@Test(priority=0)
	public void test0()
	{
		System.setProperty("webdriver.chrome.driver","D:\\All application\\selenium\\bbbb\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://parivahan.gov.in/parivahan/");	
		
	}*/
	
@Test
   public void test2() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","D:\\All application\\selenium\\bbbb\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://parivahan.gov.in/parivahan/");	

	driver.findElement(By.xpath("(//a[@class=\"bttn-more\"])[1]")).click();;

	
	
	
}
}
