package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethod2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		//in this we open first page o round arseen or not 
		WebElement is=driver.findElement(By.xpath("//input[@value='Option 1']"));
		is.click();
        boolean status=is.isDisplayed();// normal on home page or firstpage prsent
		 System.out.println(status);
		 WebElement yy= driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
		 //in this select field but not click on that therfore not displayed ans of console is false
		boolean newstatus=yy.isDisplayed();
		System.out.println(newstatus);
	
		  
		  
	/*	driver.findElement(By.xpath("(//n')a[contains(@class,'dropdow])[1]")).click();
		WebElement dis =driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
		dis.click();
		Thread.sleep(5000);
		boolean status=dis.isDisplayed();
		System.out.println(status);*/
		
		
		
	/* WebElement email1=driver.findElement(By.xpath("//a[contains(@style,'32px;')]"));
         boolean nee=   email.isDisplayed(); //in this displayed output is true
          System.out.println(nee);  
          WebElement email2=driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
             boolean mmm= email2.isDisplayed();//in this element in seleniumm field therefore not seen
                      System.out.println(mmm);*/
    

		

	}

}
