package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch google & click on gmail using linktext/partiallinktext locator ?

public class Assignment133_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();  //launching crome drivers 

		driver.get("https://google.com");

		driver.manage().window().maximize();

		//WebElement linktext = driver.findElement(By.linkText("Gmail"));  //by using locater "Linktext"
		
		//linktext.click();
		
		WebElement link_text = driver.findElement(By.partialLinkText("mail"));    //By using partial linktext 
		
		link_text.click();
		
		driver.quit();
	}

}
