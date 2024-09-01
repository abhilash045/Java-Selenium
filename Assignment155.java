package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch amazon, search shoes then select 5th option ?

public class Assignment155 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement A1 = driver.findElement(By.id("twotabsearchtextbox")); // twotabsearchtextbox

		A1.sendKeys("shoes");

		for (int i = 0; i <= 4; i++) {

			Thread.sleep(5000);
			A1.sendKeys(Keys.ARROW_DOWN);
		}

		A1.sendKeys(Keys.ENTER);
	}
}
