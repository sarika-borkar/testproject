package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class program2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\aditya\\Desktop\\excel\\New Microsoft Excel Worksheet.xlsx");
	int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	
		
		System.out.println(data+1);
	}

}
