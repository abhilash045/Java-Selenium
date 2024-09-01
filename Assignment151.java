package BasicsSelenium;

//WAP on registration page and refresh?

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment151 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		Thread.sleep(2000);
		driver.quit();

	}

}
