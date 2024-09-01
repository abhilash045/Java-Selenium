package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to Print all options of auto suggestion?

public class Assignment174 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = l1.size();

		for (int i = 0; i < count; i++) {
			WebElement sugg = l1.get(i);
			System.out.println(sugg.getText());
		}

	}
}
