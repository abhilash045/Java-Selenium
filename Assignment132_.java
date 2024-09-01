package BasicsSelenium;

//Login Face book with Firefox Browser 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//WAP to login to facebook ?

public class Assignment132_ {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver(); // Launching Firefox

		driver.get("https://www.facebook.com/"); // loading a web page or url

		driver.manage().window().maximize(); // max the tab

		WebElement username = driver.findElement(By.name("email")); // findelement and locate value

		username.sendKeys("abhilash.var5@gmail.com"); // sending the values to locater

		WebElement Password = driver.findElement(By.name("pass")); //// findelement and locate value

		Password.sendKeys("Password");

		WebElement login = driver.findElement(By.name("login")); // findelement and locate value

		login.click(); // click the login with the help of refrencevariable

		driver.quit();

	}

}
