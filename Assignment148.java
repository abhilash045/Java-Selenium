package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to launch google & double-click on gmail ?

public class Assignment148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		WebElement R1 = driver.findElement(By.xpath("(//a[.='Gmail'])"));

		Actions a1 = new Actions(driver);
		a1.doubleClick(R1).perform();

	}

}
