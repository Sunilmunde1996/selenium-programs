package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPasswordfield {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
              driver.get("https://www.facebook.com/");
              
              WebElement zz=driver.findElement(By.id("email"));// example email id field
              zz.sendKeys("ARJUN");
             // WebElement yy=driver.findElement(By.name("pass"));
             // yy.sendKeys("SUNIL");
            //  WebElement cc=driver.findElement(By.className("<_6luy _55r1 _1kbt>"));//ERROR FOUND IN CLASSNAME
              
           //   cc.sendKeys("sunil");
           // WebElement nn=driver.findElement(By.id("pass")) ;// by using id locator
          //  nn.sendKeys("Arjun");
              WebElement bb=driver.findElement(By.cssSelector("[type=password]"));
              bb.sendKeys("mm");
              
              
              
	}

}
