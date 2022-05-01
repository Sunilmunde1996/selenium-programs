package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframepractice2 {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty( "webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://demo.automationtesting.in/Frames.html");
         Thread.sleep(2000);
         driver.switchTo().frame(0);//by index
        // driver.switchTo().frame("singleframe");//by id as string
         
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sunil");
	}

}
/*driver.get("https://www.rediff.com/");
driver.switchTo().frame("moneyiframe");
driver.findElement(By.xpath("//span[@id='nseindex']")).click();

*/