package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to Drag postman to drop zone https://grotechminds.com/drag-and-drop/ ?

public class Assignment146_ {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/drag-and-drop/");

		driver.manage().window().maximize();

		WebElement drag = driver.findElement(By.xpath("(//img[@id='drag11'])"));

		Thread.sleep(2000);

		WebElement drop = driver.findElement(By.xpath("(//div[@id='div2'])"));

		Actions a1 = new Actions(driver); // Action Class
		a1.dragAndDrop(drag, drop).perform(); // DragandDrop Method

		Thread.sleep(5000);

		driver.quit();

	}

}
