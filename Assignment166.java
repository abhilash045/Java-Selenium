package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch flipkart & search shoe & click on 1st option
public class Assignment166 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("shoes");

		List<WebElement> u1 = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));

		int count = u1.size();

		u1.get(count - 3).click();

	}

}
