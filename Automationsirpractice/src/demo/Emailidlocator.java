package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emailidlocator {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
WebElement mm= driver.findElement(By.name("identifier"))	;
mm.sendKeys("Sunilmunde1996@gmail.com");
WebElement ww= driver.findElement(By.cssSelector("[jsname=V67aGc]"))	;
ww.click();
WebElement qq= driver.findElement(By.name("password"))	;
qq.sendKeys("Arjun12@");
		
	}

}
