package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to automate the username, hint, password, your first name, boy,girl,baby, male&female relocate & click to know fields

public class Assignment135_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/USER/OneDrive/Desktop/learningHTML1.html");

		driver.manage().window().maximize();

		WebElement UName = driver.findElement(By.xpath("(html/body/input)[1]"));

		UName.sendKeys("Abhilash Pasikanti");

		WebElement Hint = driver.findElement(By.xpath("(/html/body/input)[2]"));

		Hint.sendKeys("A");

		WebElement Password = driver.findElement(By.xpath("(/html/body/input)[3]"));

		Password.sendKeys("Abhi@1234");

		WebElement FName = driver.findElement(By.xpath("(//form/input)[1]"));

		FName.sendKeys("Abhilash");

		WebElement Bbutton = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		Bbutton.click();

		WebElement Gbutton = driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		Gbutton.click();

		WebElement B1button = driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		B1button.click();

		WebElement Fbutton = driver.findElement(By.xpath("(//form/input)/[6]"));
		Fbutton.click();
		
		WebElement Mbutton = driver.findElement(By.linkText("(/html/body/input)[4]"));
		
		Mbutton.click();

		// driver.quit();

	}

}
