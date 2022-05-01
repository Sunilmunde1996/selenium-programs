package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brower1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver scan=new ChromeDriver();
		//scan.get("https://www.google.com/search?q=google+meet&oq=&aqs=chrome.0.69i59i450l8.17370542j0j7&sourceid=chrome&ie=UTF-8");
		scan.navigate().to("https://www.facebook.com/");
		Dimension aa=new Dimension(300,600);
	scan.manage().window().setSize(aa);

	}

}
