package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

		Thread.sleep(3000);
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1);
		WebElement frame2=driver.findElement(By.xpath ("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(frame2);
		//Thread.sleep(2000);
		WebElement input=driver.findElement(By.xpath ("//input[@type='text']"));
		input.sendKeys("sunil");
		//driver.switchTo().parentFrame();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		
		
		


		
		


	
		
		
		
		

	}

}
