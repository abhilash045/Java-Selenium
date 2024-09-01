package BasicsSelenium;

//WAP to launch amazon & type shoes & press enter?

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Assignment131_ {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver(); // Launching FireFox

		driver.get("https://www.amazon.in/"); // Launching url

		driver.manage().window().maximize(); // Max the tab

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile"); // finding element and passing value

		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER); // locating the object and
																					// performing operation

		Thread.sleep(5000);
		driver.quit();

	}

}
