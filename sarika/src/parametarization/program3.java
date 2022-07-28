package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class program3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\aditya\\Desktop\\excel\\New Microsoft Excel Worksheet.xlsx");
	boolean data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getBooleanCellValue();
	
		
		System.out.println(data);
	}

}
