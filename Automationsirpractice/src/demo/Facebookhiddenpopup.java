package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Facebookhiddenpopup {
	
public void hiddeenPop(WebDriver driver) throws InterruptedException
{
	WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	Thread.sleep(2000);
	WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
	firstname.sendKeys("sunil");
	WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
	surname.sendKeys("munde");
	WebElement mobileno=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	mobileno.sendKeys("9545164958");
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Sunil12@");;
	WebElement day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
    Select opp=new Select(day);
    opp.selectByVisibleText("12");
    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
     Select pp=new Select(month);
     pp.selectByVisibleText("Aug");
     WebElement  year=driver.findElement(By.xpath("//select[@id='year']"));
     Select pmm=new Select(year);
     pmm.selectByValue("1996");
     driver.findElement(By.xpath("//label[text()='Male']")).click();
     driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
     Thread.sleep(5000);
     Alert obj2=driver.switchTo().alert();
     obj2.accept();
     
     
     }
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=Basicmethod.test();
	Facebookhiddenpopup obj=new Facebookhiddenpopup();
	  obj.hiddeenPop(driver);
	
	
}


	

}
