package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelaementmethod3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();	
         driver.get("http://demo.guru99.com/test/radio.html#");

         WebElement text=driver.findElement(By.xpath("//a[text()='Insurance Project']"));
         String actual=text.getText();
         System.out.println(actual);
         String correct="Insurance Project";
        // if(actual.equals(correct))
        // { System.out.println("barobar");}
        // else
        // { System.out.println("NAHI");}
         

         		
         boolean result=actual.equals(correct);

         System.out.println(result);
         
		

	}

	
	
}
