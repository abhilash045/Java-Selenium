package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to login to facebook using DDT concept?

public class Assignment171_ {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumBasics\\DDT\\Abhilash.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);

		String s1 = w1.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String s2 = NumberToTextConverter.toText(w1.getSheet("sheet1").getRow(1).getCell(0).getNumericCellValue());

		System.out.println(s1);
		System.out.println(s2);

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.id("email"));
		e1.sendKeys(s1);

		WebElement e2 = driver.findElement(By.id("pass"));
		e2.sendKeys(s2);

		driver.findElement(By.id("loginbutton")).click();

	}

}
