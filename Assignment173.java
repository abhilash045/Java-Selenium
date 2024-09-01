package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

//WAP on DDT exceptions, and how to convert numeric value to string value?

public class Assignment173 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream s1 = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\SeleniumBasics\\DDT\\Abhilash.xlsx");

		Workbook s2 = WorkbookFactory.create(s1);

		String a2 = NumberToTextConverter.toText(s2.getSheet("sheet1").getRow(1).getCell(0).getNumericCellValue());

		System.out.println(a2);
	}

}
