package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserrconfusingconcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String zz= driver.getWindowHandle();
		Set<String>address=driver.getWindowHandles();
         Iterator<String>aa=address.iterator();
	      String mm="Cognizant";
	      while(aa.hasNext()) 
	      {
	    	 driver.switchTo().window(aa.next());
	    	 String actual=driver.getTitle();
	    	 if(actual.equals(mm))
	    	 {
	    		 driver.manage().window().maximize();
	    		 //Thread.sleep(3000);
	    		// WebElement oo=driver.findElement(By.xpath("//body[@leftmargin='0']")); 
	    		// oo.click();

	    	 } 
	    	 
	    }
	      
	      Thread.sleep(3000);
	       driver.switchTo().window(zz);
	       driver.manage().window().maximize();
	        driver.findElement(By.xpath("//a[text()=' Brillio Technologies']")).click();
	       
	       
	    	  }
	    	    

	  }		   
			



