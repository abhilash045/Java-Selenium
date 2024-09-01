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
import org.openqa.selenium.support.ui.Select;

public class Assignment170 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumBasics\\DDT\\Abhilash.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);

		String FName = w1.getSheet("sheet3").getRow(0).getCell(0).getStringCellValue();
		String Lname = w1.getSheet("sheet3").getRow(1).getCell(0).getStringCellValue();
		String Email = w1.getSheet("sheet3").getRow(2).getCell(0).getStringCellValue();
		String Fnum = NumberToTextConverter.toText(w1.getSheet("sheet3").getRow(3).getCell(0).getNumericCellValue());
		String ANum = w1.getSheet("sheet3").getRow(4).getCell(0).getStringCellValue();
		String Pan = w1.getSheet("sheet3").getRow(5).getCell(0).getStringCellValue();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");

		driver.manage().window().maximize();

		driver.findElement(By.id("firstName")).sendKeys(FName);

		driver.findElement(By.id("lastName")).sendKeys(Lname);

		driver.findElement(By.id("email")).sendKeys(Email);

		driver.findElement(By.id("phone")).sendKeys(Fnum);

		WebElement e1 = driver.findElement(By.id("gender"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Male");

		WebElement e2 = driver.findElement(By.id("state"));
		Select s2 = new Select(e2);
		s2.selectByVisibleText("Telangana");

		driver.findElement(By.id("aadhaar")).sendKeys(ANum);

		driver.findElement(By.id("pan")).sendKeys(Pan);

		driver.findElement(By.id("terms")).click();

	}

}
