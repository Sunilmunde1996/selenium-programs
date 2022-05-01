package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Childbrowsercomaprisontitle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Basicmethod.test();
	//	String address2=driver.getWindowHandle();
		Set<String>address=driver.getWindowHandles();
		Iterator<String>a=address.iterator();
		driver.switchTo().window(a.next());
String title="Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";

     					
			String current=driver.getTitle();
			System.out.println(current);
		//Thread.sleep(2000);
		if(title.equals(current))
		{
			System.out.println("mainpage");
		}
		}

}
