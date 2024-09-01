package BasicsSelenium;

import org.openqa.selenium.firefox.FirefoxDriver;

//WAP using getWindowHandle & getWindowHandles?

public class Assignment128_ {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://amazon.com");

		System.out.println("getWindowHandle browserid :-  " + driver.getWindowHandle()); // it should be print in
																							// printstatement

		System.out.println("getWindowHandles browserid :-  " + driver.getWindowHandles());

		Thread.sleep(3000);
		driver.quit();

	}

}
