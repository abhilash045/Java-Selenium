package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

//WAP to launch google & type india & press enter key ?

public class Assignment130_ {
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver ();    //launching the browser 
		
		driver.get("https://www.google.com/?gws_rd=ssl");   //url launching
		
		driver.manage().window().maximize();    //maxm the tab
		
		driver.findElement(By.name("q")).sendKeys("GrotechMinds");     //find the element with the help of name "locater" and passing keys
		
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.quit();
		}

}
