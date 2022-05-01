package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hdfcchildbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Basicmethod.test();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
		
		

	}

}
