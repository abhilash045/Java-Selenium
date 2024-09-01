package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to launch flipkart & hoverover login & click on 'my profile' ?

public class Assignment145 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		WebElement F1 = driver.findElement(By.xpath("(//span[.='Login'])"));

		Actions A1 = new Actions(driver); // Actions Class
		A1.moveToElement(F1).perform();

		WebElement P1 = driver.findElement(By.xpath("(//li[@class='AT0fUR'])"));
		P1.click();

		driver.quit();

	}

}
