
package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99alertpop {
	
public void alertPop(WebDriver driver) throws InterruptedException
{	
WebElement custid=driver.findElement(By.xpath("//input[@name='cusid']"));
custid.sendKeys("2346");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='submit']")).click();

  Alert a=driver.switchTo().alert();
  //String b=  a.getText();
 // System.out.println(b);
  a.accept();
  Thread.sleep(2000);
 a.accept();
  
}


public static void main(String[] args) throws InterruptedException {
WebDriver driver=Basicmethod.test();
	
	Guru99alertpop obj1=new Guru99alertpop();
	obj1.alertPop(driver);
}
	

}
