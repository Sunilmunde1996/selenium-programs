package demo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Amazondropdown {

	public static void main(String[] args) throws IOException {
	WebDriver driver= Basicmethod.test();
	 Basicmethod.Screenshot(driver,"amazon");
	 
	 
	 WebElement all= driver.findElement(By.xpath("//select[@tabindex='0']"));
	      Select DD=new Select(all);
	      DD.selectByVisibleText("Apps & Games");
	      //amazon drop down element found by using list class
	      List<WebElement>pp=DD.getOptions();
	      int size=pp.size();
	      for(int i=0;i<size;i++)
	      {
	    	String option=pp.get(i).getText() ;
	    	System.out.println(option);
	      }
	      
	      
	      
		
		

	}

}
