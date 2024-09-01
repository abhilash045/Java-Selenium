package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment140_ {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // automating the chromedriver

		driver.get("https://grotechminds.com/payments/"); // get method to open the perticular website

		driver.manage().window().maximize(); // this syntax is for max the tab. **it is not mandatatory

		WebElement CC = driver.findElement(By.xpath("//input[@id='cardNumber']"));
		CC.sendKeys("7894561230");
		
		WebElement Ex = driver.findElement(By.xpath("//input[@placeholder='MM/YYYY']"));
		Ex.sendKeys("02/1998");
		
		WebElement CV = driver.findElement(By.xpath("//input[@maxlength='3']"));
		CV.sendKeys("789");
		
		WebElement Amount = driver.findElement(By.xpath("//input[@min='0']"));
		Amount.sendKeys("5000");
		
		WebElement CBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CBox.click();
		
		WebElement Mpayment = driver.findElement(By.xpath("//input[@type='submit']"));
		Mpayment.click();
		
		driver.quit();

	}

}
