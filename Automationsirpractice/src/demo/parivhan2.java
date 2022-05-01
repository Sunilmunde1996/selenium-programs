package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parivhan2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parivahan.gov.in/parivahan/");
		driver.findElement(By.xpath("(//a[text()='More'])[1]")).click();
       List<String>adrees=new ArrayList<String>	(driver.getWindowHandles());
        System.out.println(adrees.get(0));
         System.out.println(adrees.get(1));
       
       Thread.sleep(3000);
       driver.switchTo().window(adrees.get(1));
      // System.out.println(driver.getTitle());
       driver.findElement(By.xpath("//span[@aria-readonly='true']")).click();
       driver.findElement(By.xpath("//li[text()='Maharashtra']")).click();
       Thread.sleep(3000);
      // driver.switchTo().frame(0);
       driver.findElement(By.xpath("//input[@value='Skip']")).click();
       driver.findElement(By.xpath("//img[@src='images/shaps/LL4.png']")).click();
       driver.findElement(By.xpath("//input[@value='Continue']")).click();
       Thread.sleep(3000);
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='licenceType3']")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='licenceType'])[2]")).click();
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        driver.findElement(By.xpath("(//input[@name='aadhaarHoldingType'])[2]")).click();
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        driver.findElement(By.xpath(" //input[@name='mobileNumber']")).sendKeys("9834047688");
       // driver.findElement(By.xpath(" //button[@id='generateSarathiotp']")).click();
       // driver.findElement(By.xpath(" //input[@name='otpNumberSarathi']")).sendKeys("928028");
       // driver.findElement(By.xpath("//input[@id='verifySarathi']")).click();
 //  WebElement gg=driver.findElement(By.xpath(" //input[@name='otpNumberSarathi']"));

        //Select ooo=new Select(gg);
    //    ooo.deselectByVisibleText("DY.RTO,AMBEJOGAI -- MH44");




      // Alert gg=driver.switchTo().alert();
      // gg.accept();
       

	}

}
