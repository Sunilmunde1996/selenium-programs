package excelsheetdadafetch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheet11 {

	public static String main(int a,int b) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		String path="D:\\apachelibrary excelread\\data.xlsx";
		FileInputStream file=new FileInputStream(path);
		String username=WorkbookFactory.create(file).getSheet("Text1").getRow(a).getCell(b).getStringCellValue();
		return username;

}
	
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	String gg=Excelsheet11.main(1, 1);
	String gg1=Excelsheet11.main(1, 0);

   System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(gg);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(gg1);


	
}	
	
	
	
	

}
