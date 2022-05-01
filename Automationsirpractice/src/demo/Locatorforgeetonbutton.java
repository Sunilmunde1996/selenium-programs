package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorforgeetonbutton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
      //  driver.navigate().refresh();
       // driver.manage().window().minimize();
       // Dimension aa=new Dimension(200,300);
       // driver.manage().window().setSize(aa);
      //  Point bb=new Point(200,600);
       // driver.manage().window().setPosition(bb);
	WebElement ss=driver.findElement(By.id("email"));
	ss.sendKeys("sunil");
	WebElement tt=driver.findElement(By.id("pass"));
     tt.sendKeys("arjun");
	// by using text 
	WebElement xpath= driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	xpath.click();
	
        

}}
