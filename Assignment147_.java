package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Assignment 146 Continue WAP to revert it back the postman to its original place https://grotechminds.com/drag-and-drop/?

public class Assignment147_ {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/drag-and-drop/");

		driver.manage().window().maximize();

		WebElement drag = driver.findElement(By.xpath("(//img[@id='drag11'])"));

		Thread.sleep(2000);

		WebElement drop = driver.findElement(By.xpath("(//div[@id='div2'])"));

		Actions a1 = new Actions(driver); // Action Class
		a1.dragAndDrop(drag, drop).perform(); // DragandDrop Method

		WebElement drag1 = driver.findElement(By.xpath("(//img[@id='drag11'])"));

		Thread.sleep(2000);

		WebElement drop1 = driver.findElement(By.xpath("(//div[@id='container-10'])"));

		a1.dragAndDrop(drag1, drop1).perform();

		driver.quit();

	}

}
