package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//WAP to automate https://grotechminds.com/ x-path/ using Absolute/Relative Xpath ?

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment141_ {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver(); // automating the chromedriver

		driver.get("https://grotechminds.com/x-path/"); // get method to open the perticular website

		driver.manage().window().maximize(); // this syntax is for max the tab. **it is not mandatatory
		
		WebElement FName = driver.findElement(By.xpath("//input[@id='FirstName']"));  
		FName.sendKeys("Abhilash");
		
		WebElement MName = driver.findElement(By.xpath("//input[@id='LastName']"));  
		MName.sendKeys("Pasikanti");
		
		WebElement LName = driver.findElement(By.xpath("//input[@id='MiddleName']"));   //Work-Place-Address
		LName.sendKeys("Name");
		
		WebElement Wplace = driver.findElement(By.xpath("//textarea[@name='Work-Place-Address']"));  
		Wplace.sendKeys("Hyderabad");
		
		WebElement HAddress = driver.findElement(By.xpath("//textarea[@id='home-address']"));  
		HAddress.sendKeys("Hyderabad");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='Personal-Email']"));  
		Email.sendKeys("persionalid@gmail.com");
		
		WebElement CEmail = driver.findElement(By.xpath("//input[@id='Corporate-email']"));  
		CEmail.sendKeys("Corporateid@gmail.com");
		
		WebElement Mnumber = driver.findElement(By.xpath("//input[@id='tel']"));  
		Mnumber.sendKeys("7894561230");
		
		WebElement SubmitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));  
		SubmitButton.click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
