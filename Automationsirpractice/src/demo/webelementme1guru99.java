package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementme1guru99 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/radio.html");
	// InThis option are selected therefore out is true
     WebElement email=driver.findElement(By.xpath(" //input[contains(@value,'Option 1')]"));
     email.click();
       boolean status= email.isSelected();
        Thread.sleep(3000); //after thread sleep written then intruptexception use
           System.out.println(status);
           
           
           
         //  In this second option not click therefore it has status is false
           WebElement email1=driver.findElement(By.xpath("//input[@value='Option 2']"));
          // email1.click();
           boolean newstatus= email1.isSelected();
                 System.out.println(newstatus);
           
             
           
   }
}