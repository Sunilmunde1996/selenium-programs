package Kitezeroda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basicmethod {
	
	
	public static  WebDriver test(String url)
	{
	     ChromeOptions option=new ChromeOptions();
	     option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get(url);
		return driver;
		
	}
	
	public static String test1(int a,int b) throws EncryptedDocumentException, IOException
	{
	String path="D:\\apachelibrary excelread\\data.xlsx";
	FileInputStream file= new FileInputStream(path);
	String input=WorkbookFactory.create(file).getSheet("Text1").getRow(a).getCell(b).getStringCellValue();
	return input;
	
	}
	

}
