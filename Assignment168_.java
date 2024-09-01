package BasicsSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch naukri registration page, click on google then close parent tab window?
public class Assignment168_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");

		driver.manage().window().maximize();

		driver.findElement(By.name("google-register")).click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> id = s1.iterator();

		driver.close();

	}

}
