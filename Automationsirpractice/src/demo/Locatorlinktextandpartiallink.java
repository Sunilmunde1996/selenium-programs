package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorlinktextandpartiallink {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		//WebElement cal=driver.findElement(By.linkText("Mortgage Calculator"));
		//cal.click();
		WebElement parivha=driver.findElement(By.partialLinkText( "BMI "));
		
		parivha.click();

	}

}
