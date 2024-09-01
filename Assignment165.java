package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to search anything in https://pharmeasy.in/ & select the 3rd option ?

public class Assignment165 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();

		WebElement searchbar = driver.findElement(By.xpath(
				"(//span[@class='c-kkmdlQ c-kkmdlQ-gatHuX-structure-captionRegular c-kkmdlQ-dYJjti-weight-regular c-kkmdlQ-euWHqW-structure-inputValue c-kkmdlQ-iftOpAg-css'])[2]"));
		searchbar.click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("moov");
		Thread.sleep(3000);
		List<WebElement> a1 = driver.findElements(By.xpath(
				"(//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iieFQlv-css']/div)[2]/a"));
		Thread.sleep(3000);
		int count = a1.size();
		System.out.println(count);
		a1.get(count - 8).click();
	}

}
