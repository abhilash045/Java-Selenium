package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//WAP to launch google & right-click on gmail?

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment149 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		WebElement G1 = driver.findElement(By.xpath("(//a[.='Gmail'])"));

		Actions A1 = new Actions(driver);
		A1.contextClick(G1).perform();

		driver.quit();

	}

}
