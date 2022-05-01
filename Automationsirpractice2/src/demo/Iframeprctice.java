package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeprctice {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://demoqa.com/frames");
			//driver.switchTo().frame("frame1");// by using id as string
			//driver.switchTo().frame(1); //by using index of iframe
			WebElement jj=driver.findElement(By.xpath("//iframe[@id='frame1']"));
			driver.switchTo().frame(jj);
			WebElement uu= driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		    System.out.println(uu.getText());	

	}

}
