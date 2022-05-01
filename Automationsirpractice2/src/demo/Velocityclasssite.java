package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Velocityclasssite {
	
	public void test(WebDriver driver) throws InterruptedException
	{
	List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio']"));
	radio.get(2).click();
    System.out.println(radio.get(1).isEnabled());
    WebElement drop=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
	Select obj1=new Select(drop);
	obj1.selectByValue("option1");
	Actions action=new Actions(driver);
    WebElement check=driver.findElement(By.xpath("//input[@value='option1']"));
    action.moveToElement(check).click().perform();;
    WebElement window=driver.findElement(By.xpath("//a[text()='Open Tab']"));
   window.click();
   Thread.sleep(2000);
   List<String>address=new ArrayList<String>(driver.getWindowHandles());
   driver.switchTo().window(address.get(1));
   WebElement childwindow=driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
   childwindow.click();
   driver.switchTo().window(address.get(1));
   driver.close();
   driver.switchTo().window(address.get(0));

   WebElement alertwindow=driver.findElement(By.xpath("//input[@name='enter-name']"));
   alertwindow.sendKeys("suinl");
   WebElement submit=driver.findElement(By.xpath("//input[@value='Confirm']"));
   submit.click();
   Alert alert=driver.switchTo().alert();
   alert.accept();
  WebElement mouse=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
  action.moveToElement(mouse);
    WebElement mouss1=driver.findElement(By.xpath("//a[text()='Reload']"));
   action.moveToElement(mouss1).click();
   action.build().perform();
  WebElement district=driver.findElement(By.xpath("//input[@list='mah-district']"));
  district.sendKeys("Beed");
   Thread.sleep(2000);
   WebElement date=driver.findElement(By.xpath("//input[@type='date']"));
   date.sendKeys("22/02/2000");
   
   driver.switchTo().frame(0);
   driver.manage().window().maximize();







    
    
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Basicmethod.test1("https://vctcpune.com/selenium/practice.html");
		Velocityclasssite obj=new Velocityclasssite();
		obj.test(driver);
		
	}

}
