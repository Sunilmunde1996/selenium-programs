package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findelementssir {
	
	public void deom(WebDriver driver)
	{
	List<WebElement> addd=driver.findElements(By.xpath("//input[@name=\"name\"]"));
		addd.get(1).click();
	System.out.println(	addd.get(1).getAttribute("name"));
	}
	public static void main(String[] args) {
	WebDriver driver=	Basicmethod.test1("http://demo.guru99.com/test/ajax.html");
		findelementssir obj=new findelementssir();
		obj.deom(driver);
		
		
	}

}
