package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouseactiondragdropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462777326&hvpos=&hvnetw=g&hvrand=10048010864476212326&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAiAnO2MBhApEiwA8q0HYdR2WB9XvkACPcPbjlcuqcjO8ZNYzktIrMz7TxytEreOkAF9DrMyDxoC2sAQAvD_BwE");
		WebElement account=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']"));
		Actions clss=new Actions(driver);
		clss.moveToElement(account);
		clss.perform();
		WebElement myaccount=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		clss.moveToElement(myaccount);
		clss.contextClick();//right click
		Thread.sleep(2000);
		clss.click();
        clss.build().perform();
        
        
        
               
          
         
        
         
        
        
        
           
        
        
       // Select select=new Select(myaccount);
        
        
        
        
        

		
		
		

	}

}
