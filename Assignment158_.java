package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to handle JavaScript popup https://grotechminds.com/javascript-popup/

public class Assignment158_ {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/javascript-popup/");

		driver.manage().window().maximize();

		WebElement w1 = driver.findElement(By.className("btnjs"));

		w1.click();

		Thread.sleep(2000); //it is given due to synchnorization issue

		driver.switchTo().alert().accept(); // to accepct pop button

	}

}
