package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	
	public static void main(String[] args) {
		WebDriver driver=Dropdown.callbroswer();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		                               //dropdown.click();
		Select all=new Select(dropdown) ;
		all.selectByValue("babycat");
		all.selectByVisibleText("Big Baby Cat");  //this are the method of selectclass
		all.selectByIndex(3);
		
		// how many option present in drop down this are list method
		List<WebElement>op=all.getOptions();
		int size=op.size();
		for(int i=0;i<size;i++)
		{
			String options=op.get(i).getText();
			System.out.println(options);
		}
		
		System.out.print(size);
		//driver.close();
		driver.quit();

	}

		
		
		
		
		

	}


