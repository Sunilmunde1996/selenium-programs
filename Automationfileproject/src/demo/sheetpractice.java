package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheetpractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="D:\\apachelibrary\\data.xlsx";
		FileInputStream file=new FileInputStream(path);
	   String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);

	}

}
