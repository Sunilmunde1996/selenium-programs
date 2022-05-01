package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class allimagesmouseactindropdragon {
	
	public void drag(WebDriver driver) throws InterruptedException
	{
	driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@width=\"700\"])[1]")));
	
	List<WebElement>gallery=driver.findElements(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
	// System.out.println(gallery.get(0).getAttribute("name"));
	    WebElement img1=gallery.get(0);
        WebElement img2=gallery.get(1);
	     WebElement img3=gallery.get(2);
	    WebElement img4=gallery.get(3);
   
	Actions obj=new Actions(driver);
	WebElement gg=driver.findElement(By.xpath("//div[@id='trash']"));
	
	 obj.dragAndDrop(img1, gg);
	 obj.dragAndDrop(img2, gg);
	 obj.dragAndDrop(img3, gg);
	 obj.dragAndDrop(img4, gg);
	 obj.build().perform();
	 
	 WebElement img5=gallery.get(0);
     WebElement img6=gallery.get(1);
	     WebElement img7=gallery.get(2);
	    WebElement img8=gallery.get(3);
	    
		WebElement gg1=driver.findElement(By.xpath("//ul[@id='gallery']"));
		obj.dragAndDrop(img5, gg1);
		obj.dragAndDrop(img6, gg1);
		obj.dragAndDrop(img7, gg1);
		obj.dragAndDrop(img6, gg1);
		obj.build().perform();

  

	 
	}
	public static void main(String[] args) throws InterruptedException {

  WebDriver driver=Basicmethod.test1("https://www.globalsqa.com/demo-site/draganddrop/");
 allimagesmouseactindropdragon obj=new allimagesmouseactindropdragon();
	obj.drag(driver);
}
}
