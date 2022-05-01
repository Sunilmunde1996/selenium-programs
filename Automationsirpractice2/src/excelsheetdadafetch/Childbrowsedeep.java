package excelsheetdadafetch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowsedeep {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.get("https://www.naukri.com/");
             Set<String>address=driver.getWindowHandles();
             Iterator<String>aa=address.iterator();
            // driver.switchTo().window(aa.next()); for gettitle from windows we use this method
           //  System.out.println(driver.getTitle());
             String title="Sopra";
             while(aa.hasNext())
            {  
            	 driver.switchTo().window(aa.next());
            	 String currenttitle=driver.getTitle();
            	  if(title.equals(currenttitle))
            	  {
            		  driver.manage().window().maximize();
            		  driver.findElement(By.xpath("//img[@width='250']")).click();
            	  }
            		
            	  else
            	  {
            		driver.close();  
            	  }
            } 
            	 Thread.sleep(2000);
             Set<String>address1=driver.getWindowHandles();
             Iterator<String>bb=address1.iterator();
            //driver.switchTo().window(bb.next());
            //System.out.println(driver.getTitle());
           // driver.switchTo().window(bb.next());
           // System.out.println(driver.getTitle());
              String hh="Job Search Results - Sopra Steria Group Careers";
              Thread.sleep(2000);
              while(bb.hasNext())
              {
            	driver.switchTo().window(bb.next())  ;
            	String comparison=driver.getTitle();
            	if(hh.equals(comparison))
            	{	
            	driver.findElement(By.xpath("//a[@aria-describedby='capsuleContent_2']")).click();	
            	}
            	else
            	{
            		driver.close();
            	}
              }	
              Thread.sleep(2000);
            	Set<String>address3=driver.getWindowHandles();
            	Iterator<String>cc=address3.iterator();
            	//driver.switchTo().window(cc.next());
            	//System.out.println(driver.getTitle());
            	//driver.switchTo().window(cc.next());
            	//System.out.println(driver.getCurrentUrl());
            	String katraj="https://soprasteriaintl.taleo.net/careersection/iam/accessmanagement/login.jsf?lang=en&redirectionURI=https%3A%2F%2Fsoprasteriaintl.taleo.net%2Fcareersection%2Ffr_cscand%2Fprofile.ftl%3Flang%3Den&TARGET=https%3A%2F%2Fsoprasteriaintl.taleo.net%2Fcareersection%2Ffr_cscand%2Fprofile.ftl%3Flang%3Den";


            	Thread.sleep(2000);
            	while(cc.hasNext())
            	{
            		driver.switchTo().window(cc.next());
            		String pimpri=driver.getCurrentUrl();
            		if(katraj.equals(pimpri))
            		{	
            			driver.manage().window().maximize();
            			driver.findElement(By.xpath("(//input[@style='width: 100%;max-width: 226px;'])[1]")).sendKeys("SUNIL");
            			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("SMMM");
            			driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();

            		}
            		else
            		{
            			driver.close();
            		}
            	}
            		
           }}
