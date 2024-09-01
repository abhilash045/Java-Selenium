package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment164_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();

		driver.findElement(By.id("username")).sendKeys("Abhilash");

		driver.findElement(By.name("password")).sendKeys("Abhilash");

		driver.findElement(By.id("loginCaptchaValue")).sendKeys("Abhilash");

		// driver.findElement(By.name("optionOfCaptcha")).click();

	}

}
