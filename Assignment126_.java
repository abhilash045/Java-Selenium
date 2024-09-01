package BasicsSelenium;

//WAP to maximize & minimize any Browser?

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment126_ {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://facebook.com");

		driver.manage().window().maximize(); // maximize the tab

		driver.manage().window().minimize(); // minimize the tab

		driver.quit();
	}

}
