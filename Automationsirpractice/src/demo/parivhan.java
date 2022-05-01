package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parivhan {                        // SarathiOnWeb


	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://parivahan.gov.in/parivahan/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@href='https://parivahan.gov.in/parivahan//node/1978'])[2]")).click();
	Set<String>address=driver.getWindowHandles();
	Iterator<String>aa=address.iterator();
	//driver.switchTo().window(aa.next());
	//System.out.println(driver.getTitle());
	//driver.switchTo().window(aa.next());
	//System.out.println(driver.getTitle());
	String dd="Vehicle Related Services | Parivahan Sewa | Ministry of Road Transport & Highways, Government of India";

	Thread.sleep(3000);
	while(aa.hasNext())
	{
              driver.switchTo().window(aa.next());
              String current =driver.getTitle();
              System.out.println(current);
              
              Thread.sleep(3000);
             if(dd.equals(current))
              {   WebElement yy=driver.findElement(By.xpath("//select[@name=\"aa\"]"));
              
                   Select pp=new Select(yy) ;
                   pp.selectByVisibleText("Maharashtra");
            WebElement  uu   =driver.findElement(By.xpath("(//img[@style='vertical-align:bottom'])[1]"));
                 uu.click(); 
                 Thread.sleep(2000);
                   driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("MH44G2813");
                   driver.findElement(By.xpath("(//span[text()='Proceed'])[1]")).click();
                 Alert ll=driver.switchTo().alert();
              ll.dismiss();
              }
	}


      
	}

}
