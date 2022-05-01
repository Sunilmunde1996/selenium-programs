package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Childbrowserfirstpagecontrol {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= Basicmethod.test();
		Set<String>adress=driver.getWindowHandles();
		Iterator<String>a=adress.iterator();
		String title="Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
   while(a.hasNext())
{    
	   driver.switchTo().window(a.next());
	   String actual=driver.getTitle();
	   if(actual.equals(title))
	   {
		   driver.manage().window().maximize();
			WebElement cc=  driver.findElement(By.xpath("//div[text()='Login']"));
            cc.click();
            Thread.sleep(2000);
			WebElement dd=  driver.findElement(By.xpath("(//input[@type='text'])[1]"));
            dd.sendKeys("999999999");
			WebElement ee=  driver.findElement(By.xpath("//input[@type=\"password\"]"));
                 ee.sendKeys("wsqcewc") ;
                Thread.sleep(2000);
     			 driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();

	   
	   }	
}
			
		
		
		
		
		
		

	}
              

}
