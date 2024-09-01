package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch google, type india & select the 5th auto-suggestion

public class Assignment162_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://google.com/");

		driver.manage().window().maximize();

		WebElement w1 = driver.findElement(By.name("q"));

		w1.sendKeys("india");

		List<WebElement> e1 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

		int count = e1.size();

		e1.get(count-6).click();

	}

}
