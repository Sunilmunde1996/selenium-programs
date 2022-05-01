package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class guru99chilebrowser {

	public static void main(String[] args) throws InterruptedException {
		// successfully handle childbrowser popup by using current url type 
		
		
		WebDriver driver=Basicmethod.test();
		Set<String> adress=driver.getWindowHandles();
		Iterator<String> aa=adress.iterator();
		//System.out.println(aa.next());
		//System.out.println(aa.next());
	
		String title="http://demo.guru99.com/articles_popup.php";
         Thread.sleep(3000);
		while(aa.hasNext())
		{
		driver.switchTo().window(aa.next());
		
           String current=driver.getCurrentUrl();
           System.out.println(current);
           if(title.equals(current))
           {driver.manage().window().minimize();
        	   Thread.sleep(3000);
               driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("gurav.2n@gmail.com");
        	  Thread.sleep(3000);
               driver.findElement(By.xpath("//input[@value='Submit']")).click();

                driver.close();
           }
		}
		
		
	
		
		
		
		
		//http://demo.guru99.com/articles_popup.php


            	
            }
}
			
		
	


