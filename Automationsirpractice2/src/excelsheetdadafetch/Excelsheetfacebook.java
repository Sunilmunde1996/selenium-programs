package excelsheetdadafetch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Excelsheetfacebook {
	
	
	public String test1(int a,int b) throws EncryptedDocumentException, IOException
	{
	String path="D:\\apachelibrary excelread\\data.xlsx";	
	FileInputStream file=new FileInputStream(path);
        String value=WorkbookFactory.create(file).getSheet("Text1").getRow(a).getCell(b).getStringCellValue();
	return value;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		Excelsheetfacebook obj=new Excelsheetfacebook();
		String output =obj.test1(1,0);
		System.out.println(output); 
		String output1=obj.test1(1, 1);
		System.out.println(output1);
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.spicejet.com/");
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("(//input[@data-focusable='true'])[3]")).sendKeys(output);
		driver.findElement(By.xpath("//input[@style='font-family: inherit;']")).sendKeys(output1);
		driver.findElement(By.xpath("(//div[contains(@style,'padding')])[8]")).click();


		}
	

}
