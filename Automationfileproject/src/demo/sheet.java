package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet {

	public static String shot(int a,int b) throws EncryptedDocumentException, IOException {
		
		String path="D:\\apachelibrary\\data.xlsx";
		FileInputStream file=new FileInputStream(path);
         String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
		return value;
		}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String username=sheet.shot(1, 0);
	System.out.println(username);	
	}

}

