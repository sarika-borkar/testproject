package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class program5 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\aditya\\Desktop\\excel\\New Microsoft Excel Worksheet.xlsx");
	int data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
	
		
		System.out.println(data);
	}

}
