package excelsheetdadafetch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet1 {
	 public static String text1(int a,int b ) throws EncryptedDocumentException, IOException
	 { 
	String path="D:\\apachelibrary\\Excel1.xlsx";
	FileInputStream file=new FileInputStream(path);
String value=WorkbookFactory.create(file).getSheet("Test1").getRow(a).getCell(b).getStringCellValue();
	return value;
	
}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
    String id1=Excelsheet1.text1(3, 1);
System.out.println(id1);

}	 
}