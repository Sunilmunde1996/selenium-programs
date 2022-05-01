package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='Deals']")).click();
		Set<String>address=driver.getWindowHandles();
		Iterator<String>aa=address.iterator();
		//driver.switchTo().window(aa.next());
		//System.out.println(driver.getCurrentUrl());
		//driver.switchTo().window(aa.next());
		//System.out.println(driver.getCurrentUrl());
		
		 Thread.sleep(3000);
		String ff="https://corporate.spicejet.com/RedHotOffers.aspx";
     while(aa.hasNext())
{
	driver.switchTo().window(aa.next());
	String ggg=driver.getCurrentUrl();
	if(ggg.equals(ff))
	{
		driver.close();
	}
	
	
}

		

	}

}
