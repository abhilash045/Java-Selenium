package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch google, type India, select 4th auto suggestion from drop ?

public class Assignment154_ {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://google.com/");

		driver.manage().window().maximize();

		WebElement n1 = driver.findElement(By.name("q"));

		n1.sendKeys("India");

		for (int i = 0; i <= 4; i++) {

			Thread.sleep(5000);

			n1.sendKeys(Keys.ARROW_DOWN);

		}

		n1.sendKeys(Keys.ENTER);

	}

}
