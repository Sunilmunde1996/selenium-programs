package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactionparivhan {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://parivahan.gov.in/parivahan/");
	WebElement onlineservice=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(onlineservice);
	WebElement drivinglicense=driver.findElement(By.xpath("(//a[contains(text(),'Driving')])[1]"));
       action.moveToElement(drivinglicense);
       action.click();
       action.build().perform();

	}

}
