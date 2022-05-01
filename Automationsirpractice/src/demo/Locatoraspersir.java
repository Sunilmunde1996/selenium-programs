package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatoraspersir {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.facebook.com/");
	WebElement w=driver.findElement(By.id("email"));//email field
	w.sendKeys("sunilmunde1996@gmail.com");
	WebElement pass=driver.findElement(By.name("pass"));//password field
	pass.sendKeys("Arjun12@mm");
	//WebElement login= driver.findElement(By.tagName("button"));
    //   login.click();
   	WebElement tt= driver.findElement(By.cssSelector("[name='login']"));// CTRL+FUN =
            tt.click();
	}

}
