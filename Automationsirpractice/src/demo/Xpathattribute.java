package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathattribute {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver()	;
	driver.get("https://www.facebook.com/");
	
// xpath by attribute(email id field)
	WebElement xpath1= driver.findElement(By.xpath("//input[@type=\"text\"]"));
      xpath1.sendKeys("sunilmunde");
// xpath by text (forgotten field) 
     // WebElement xpath2=driver.findElement(By.xpath(" //a[text()='Forgotten password?']"));
     // xpath2.click();
 // xpath by contains(password field)
      WebElement xpath3=driver.findElement(By.xpath("//input[contains(@class,'9npi')]"));
         xpath3.sendKeys("arjun");
 // xpath by  index ( registration)
       WebElement xpath4=driver.findElement(By.xpath(" (//a[contains(@role,'button')])[3]"))  ;
       System.out.println(xpath4.getTagName());
       xpath4.click() ;
         
         
   
	
	}
	}