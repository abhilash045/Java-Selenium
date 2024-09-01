package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch amazon & click on customer service & mobile ?  //by using linktext & partiallinktext

public class Assignment134_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// WebElement amz01 = driver.findElement(By.linkText("Customer Service"));
		// //linktext locator
		// amz01.click();

		WebElement amz = driver.findElement(By.partialLinkText("Service")); // partial_Linktext Locator

		amz.click();

		driver.quit();

	}

}
