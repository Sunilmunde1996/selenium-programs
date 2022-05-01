package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Childbrowerpopuptitleget {

	public static void main(String[] args) {
		
		
		WebDriver driver=Basicmethod.test();
		Set<String>address=driver.getWindowHandles();
		Iterator<String>aa=address.iterator();
		driver.switchTo().window(aa.next());
		System.out.println(driver.getTitle());
		driver.switchTo().window(aa.next());
		System.out.println(driver.getTitle());
		driver.switchTo().window(aa.next());
		System.out.println(driver.getTitle());
		driver.switchTo().window(aa.next());
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
