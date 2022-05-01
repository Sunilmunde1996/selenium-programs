package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowsersimpleconceptmainpage {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.naukri.com/");
     Thread.sleep(3000);
     driver.manage().window().maximize();
       WebElement course= driver.findElement(By.xpath("//a[text()=' Brillio Technologies']"));
     course.click();
	
	}

}
