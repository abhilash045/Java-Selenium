package BasicsSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//WAP to take a screenshot of any website ?

public class Assignment161_ {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://google.com/");

		driver.manage().window().maximize();

		TakesScreenshot s1 = driver;

		File file = s1.getScreenshotAs(OutputType.FILE);

		File trg = new File("C:\\Users\\USER\\OneDrive\\Desktop\\screenshot"+ Math.random() +".png");

		FileHandler.copy(file, trg);

	}

}
