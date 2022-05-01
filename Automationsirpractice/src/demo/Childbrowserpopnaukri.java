package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Childbrowserpopnaukri {
	
	//in this use nokari.com url
	//we get address from this
	
	
	public static void main(String[]args)
{   
		WebDriver driver=Basicmethod.test();
		Set<String>address=driver.getWindowHandles();
		Iterator<String>a=address.iterator();
		System.out.println(a.next());
		System.out.println(a.next());
		System.out.println(a.next());
		System.out.println(a.next());
		driver.close();

		
		
		
	

		




}

}
