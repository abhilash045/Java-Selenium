package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to login to facebook using xpath by Attribute?

public class Assignment139_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement Fb = driver.findElement(By.name("email"));
		Fb.sendKeys("pasikantiabhilash@gmail.com");

		WebElement Pw = driver.findElement(By.name("pass")); // login
		Pw.sendKeys("Password!");

		WebElement Login = driver.findElement(By.name("login"));
		Login.click();

		driver.quit();

	}

}
