package start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFrom_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis= new FileInputStream("./Test Data/AutomationTestdata.xlsx");
Workbook wb = WorkbookFactory.create(fis);
String value = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
String value1 = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();

	System.out.println(value);
	System.out.println(value1);
	
	}

}
