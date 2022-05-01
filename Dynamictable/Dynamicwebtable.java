package Dynamictable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	List<WebElement>row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr"));
	System.out.println(row.size());
	List<WebElement>col=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//th"));
	System.out.println(col.size());
	double m=0;
	double r=0;
	for(int i=0;i<=row.size();i++)
	{
	String max=	driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//td")).getText();
	m=Double.parseDouble(max);
	System.out.println(m);
	if(m>r) {
		r=m;
		
	}
	}
	System.out.println("maximum price"+r);
	}
	}
