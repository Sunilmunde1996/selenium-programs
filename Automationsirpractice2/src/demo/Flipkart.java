package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart {
	
	public void test1(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphones12");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 128 GB)']")).click();
		List<String>address=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(address.get(1));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("9545164958");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();


		
	}
	
	
	
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver=Basicmethod.test1("https://www.flipkart.com/");
	Flipkart obj=new Flipkart();
	obj.test1(driver);
	
}
}
