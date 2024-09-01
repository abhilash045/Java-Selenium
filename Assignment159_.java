package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to handle JavaScript popup in "learningHTML1" ?

public class Assignment159_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/USER/OneDrive/Desktop/learningHTML1.html");

		driver.manage().window().maximize();

		driver.switchTo().alert().accept();  //popup accept syntax

	}

}
