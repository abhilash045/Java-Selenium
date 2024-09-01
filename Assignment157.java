package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"WAP to launch google, then click on gmail only when it is enabled & displayed?

public class Assignment157 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		WebElement G1 = driver.findElement(By.xpath("(//a[.='Gmail'])"));

		boolean B1 = G1.isDisplayed(); // is Displayed Method-->returntype is boolean

		System.out.println(B1);

		boolean B2 = G1.isEnabled(); // is Enabled
		
		System.out.println(B1);

		if (B2 && B1) // And Operator!
		{
			G1.click();
		}

	}

}
