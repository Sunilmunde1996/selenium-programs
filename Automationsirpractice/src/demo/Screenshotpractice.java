package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpractice {

	public static void Screenshot(WebDriver driver)throws IOException {
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\SCREENSHOT\\sss.jpg");
		FileHandler.copy(source,dest);
		
	
	}
	public static void main(String[] args) throws IOException {
	WebDriver driver=	Screenshot2.test();
	Screenshotpractice.Screenshot(driver);	}
		
	}
	

	


