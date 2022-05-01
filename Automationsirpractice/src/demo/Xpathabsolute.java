package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathabsolute {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/");
		 
		 // BY USING REALTIVE PATH WC3SCHOOL   REFERENCES PAGER
        //WebElement relative= driver.findElement(By.xpath("//html//div[3]//a[3]"));
       // relative.click();
        //  By using absolute path w3cschool refernce pages
        WebElement p=driver.findElement(By.xpath("/html/body/div[3]/a[3]"));
        p.click();
        
        
        
        
        
	}

}
