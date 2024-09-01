package BasicsSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

//WAP to navigate Backward, forward and Refresh?
public class Assignment150_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://google.com");

		driver.manage().window().maximize();

		driver.navigate().back(); // navigate.back methord

		Thread.sleep(3000);

		driver.navigate().forward(); // navigate farword method

		driver.navigate().refresh(); // //navigate refresh methord

		driver.quit();

	}

}
