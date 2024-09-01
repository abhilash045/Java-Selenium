package BasicsSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch amazon & search shoes then click on any shoes result & then move the control from parent to child window?

public class Assignment167_ {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes", Keys.ENTER);

		WebElement s1 = driver.findElement(By.xpath("((//span[@class='rush-component'])/a/div)[1]"));

		s1.click();

		Thread.sleep(2000);

		Set<String> s2 = driver.getWindowHandles(); // gethandlesmethod is get the ids of parents &child

		Iterator c1 = s2.iterator();

		Iterator<String> id = s2.iterator();

		String s3 = id.next();

		String childid = id.next();

		driver.switchTo().window(childid);

		driver.close();

	}

}
