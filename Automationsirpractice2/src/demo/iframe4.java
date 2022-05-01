package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();

	 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		   Thread.sleep(2000);
	/* driver.switchTo().frame("packageListFrame");
		  driver.findElement(By.xpath("//a[@href='org/openqa/selenium/chrome/package-frame.html']")).click();;
		   Thread.sleep(2000);
		   driver.switchTo().defaultContent();
    driver.switchTo().frame( driver.findElement(By.xpath("//iframe[@src='allclasses-frame.html']")));
		  driver.findElement(By.xpath("(//a[@title='class in org.openqa.selenium.chrome'])[1]")).click();
		   Thread.sleep(2000);
	        driver.switchTo().defaultContent();
    driver.switchTo().frame( driver.findElement(By.xpath("//iframe[@src='overview-summary.html']")));
			 WebElement ff=driver.findElement(By.xpath( " (//a[@href='../chromium/AddHasCasting.html'])[1]"));
			  ff.click();*/
		    
		  
			 
			 
		  
  
         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='allclasses-frame.html']))")));
        driver.manage().window().maximize();
        // driver.findElement(By.xpath("(//a[@target='classFrame'])[1]")).click();


		   
		   
		   
		   
	}

}
