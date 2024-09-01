package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment163_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		
		List<WebElement>  w1 =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		int count = w1.size();
		
		w1.get(count -4).click();

	}
}
