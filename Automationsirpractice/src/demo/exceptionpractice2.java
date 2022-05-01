package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceptionpractice2 {

	public static void main(String[] args) throws IOException {
		try
		{ 
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		 Thread.sleep(3000);
	   WebElement ff=driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
	     ff.click();
	     Thread.sleep(2000);
		WebElement gg=driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
		gg.click();
		WebElement hh=driver.findElement(By.xpath("//font[text()='DEMO Flash Movie']"));
          if(hh.isDisplayed()==true)
          {
        	  Basicmethod.Screenshot(driver,"flashmovie");  
          }
		}

		catch(Exception e)
		{
	     System.out.println("mmmm");
		}
		

	}

}
