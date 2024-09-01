package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch amazon, select books from the dropdown menu then search for power using Keys function?

public class Assignment_152 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		driver.manage().window().maximize();
		
		WebElement d1 = driver.findElement(By.id("twotabsearchtextbox"));
		
		d1.sendKeys("mobiles");
		
		Thread.sleep(5000);
		
		List<WebElement> s1 =driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']/div/div"));
		
		int count =s1.size();
		
		System.out.println(s1);
		
		

	}

}
