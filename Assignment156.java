package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
"WAP to check whether radio button is selected or not https://grotechminds.com/is-selected/"
*/
public class Assignment156 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/is-selected/");

		driver.manage().window().maximize();

		WebElement radiobutton = driver.findElement(By.id("vehicle2"));

		radiobutton.click(); //Before Select the radio button
		
		System.out.println(radiobutton.isSelected());

	//	driver.quit();

	}

}
