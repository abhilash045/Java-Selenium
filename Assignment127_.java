package BasicsSelenium;

import org.openqa.selenium.firefox.FirefoxDriver;

//WAP using close or quit  ?

public class Assignment127_ {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://grotechminds.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.close(); // it close only the parent tab
		driver.quit(); // it closes parent tab and child tabs

	}

}
