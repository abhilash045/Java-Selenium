package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment137_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");

		driver.manage().window().maximize();   
													//class="lname form-control "
		
		WebElement FName = driver.findElement(By.xpath("//input[@id='fname']"));
		FName.sendKeys("Pasikanti");
		
		WebElement LName = driver.findElement(By.xpath("//input[@id='lname']"));
		LName.sendKeys("Abhilash");
		
		//id="Present-Address"
		
		WebElement EName = driver.findElement(By.xpath("//input[@id='email']"));
		EName.sendKeys("newuser@gmail.com");
		
		WebElement PName = driver.findElement(By.xpath("//input[@id='password']"));
		PName.sendKeys("Password!");
		
		WebElement RButton = driver.findElement(By.xpath("//input[@id='male']"));
		RButton.click();
		
		WebElement PAddress = driver.findElement(By.xpath("//textarea[@id='Present-Address']"));  
		PAddress.sendKeys("Hyderabad");
		
		WebElement PAAddress = driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));  
		PAAddress.sendKeys("Hyderabad");                                                                   //name="Submit"
		
		WebElement PCode = driver.findElement(By.xpath("//input[@id='Pincode']"));  
		PCode.sendKeys("xxxxx");
		
		WebElement Cbox = driver.findElement(By.xpath("//input[@id='relocate']"));
		Cbox.click();
		
		WebElement SBuuton = driver.findElement(By.xpath("//Button[@name='Submit']"));
		SBuuton.click();
		
		
		driver.quit();

	}

}
