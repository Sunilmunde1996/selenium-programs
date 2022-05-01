package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/login/");
	//driver.close();
	driver.navigate().to("https://www.facebook.com/login/");
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	String title=driver.getTitle();

	System.out.println(title);
	String actualtitle="Log in to Facebook";
	 if(actualtitle.equals(title))
	   {System.out.println("pass");}
		 
	 else 
		System.out.println("fail "); 
		 
		}}