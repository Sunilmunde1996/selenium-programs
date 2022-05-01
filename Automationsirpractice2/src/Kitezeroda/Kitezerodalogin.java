package Kitezeroda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Kitezerodalogin {
	
	public void login(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		String username=Basicmethod.test1(3, 0);
	WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
	userid.sendKeys(username);
	String password=Basicmethod.test1(3, 1); 
	Thread.sleep(2000);
	WebElement passid =driver.findElement(By.xpath("//input[@id='password']"));
	passid.sendKeys(password);
	Thread.sleep(2000);
	WebElement submit =driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
	Thread.sleep(2000);
	WebElement pinid =driver.findElement(By.xpath("//input[@type='password']"));
    String Pin= Basicmethod.test1(3, 2);
    pinid.sendKeys(Pin);
	WebElement pinid1 =driver.findElement(By.xpath("//button[@type='submit']"));
	pinid1.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@href='/orders'])[1]")).click();
	Thread.sleep(2000);
     driver.findElement(By.xpath( "//a[@target='_blank']")).click();
     Thread.sleep(2000);
     
     List<String>history=new ArrayList<String>(driver.getWindowHandles());
      driver.switchTo().window(history.get(1));
      Thread.sleep(2000);

        List< WebElement> option1=driver.findElements(By.tagName("option"));
        System.out.println(option1.size());
        option1.get(2).click();
       
      
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver=Basicmethod.test( "https://kite.zerodha.com/");
	Kitezerodalogin obj=new Kitezerodalogin();
	obj.login(driver);
	}

}
