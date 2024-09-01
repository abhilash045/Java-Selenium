package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to launch amazon & hoverover account&list then click on signin?

public class Assignment144 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement H1 = driver.findElement(By.xpath("(//span[.='Hello, sign in'])")); // textsyntax -->
																						// "(//tagname[.=''])"

		Actions s1 = new Actions(driver);
		s1.moveToElement(H1).perform();

		WebElement S2 = driver.findElement(By.xpath("(//span[.='Sign in'])"));
		S2.click();

	}

}
