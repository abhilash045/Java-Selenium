package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//WAP to Print all options of dropdown & count all options in dropdown?

public class Assignment175 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		Select s1 = new Select(drop);

		List<WebElement> opt = s1.getOptions();

		int count = opt.size();

		System.out.println(count);
		for (int i = 0; i < count; i++) {

			WebElement alldrop = opt.get(i);
			System.out.println(alldrop.getText());

		}

	}
}
