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

public class  Excelsheetdatafetch {

	public static String shot(int a,int b) throws EncryptedDocumentException, IOException {
		
		String path="D:\\apachelibrary excelread\\data.xlsx";
		FileInputStream file=new FileInputStream(path);
		String value=WorkbookFactory.create(file).getSheet("Text1").getRow(1).getCell(0).getStringCellValue();
		return value;
		}

	public static void test1() throws EncryptedDocumentException, IOException
	{
	//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	//WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String username=Excelsheetdatafetch.shot(1,0);
	System.out.println(username);	
	String pass=Excelsheetdatafetch.shot(1,1);
	System.out.println(pass);	
	  Excelsheetdatafetch.test1();
}

}

