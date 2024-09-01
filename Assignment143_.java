package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Continue Assignment 142 after selecting books, search for book & press enter ?

public class Assignment143_ {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();  //Lunching the ChromeBrowser

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement selectClass = driver.findElement(By.id("searchDropdownBox"));  //FindElementByid
		
		Select s1 = new Select(selectClass);  //Select class
		s1.selectByVisibleText("Books");     //select class Method

		WebElement ClickButton = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
		ClickButton.click();              

		Thread.sleep(5000);

		driver.quit();

	}

}
