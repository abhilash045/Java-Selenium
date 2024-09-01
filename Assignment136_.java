package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to automate https://grotechminds.com/registeration-form/ ?

public class Assignment136_ {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://grotechminds.com/registeration-form/");
		
		driver.manage().window().maximize();
		
		WebElement FName = driver.findElement(By.xpath("(//input)[2]"));	
		FName.sendKeys("Abhilash");			
		
		WebElement LName = driver.findElement(By.xpath("(//input)[3]"));
		LName.sendKeys("Pasikanti");
		
		
		WebElement EName = driver.findElement(By.xpath("(//input)[4]"));
		EName.sendKeys("newuser@gmail.com");
		
		WebElement Mnumnber = driver.findElement(By.xpath("(//input)[5]"));
		Mnumnber.sendKeys("0987654321");
		
		WebElement Anumnber = driver.findElement(By.xpath("(//input)[6]"));
		Anumnber.sendKeys("0987654321");
		
		WebElement 	Pnumnber = driver.findElement(By.xpath("(//input)[7]"));
		Pnumnber.sendKeys("09AZXIO45");
		
		WebElement 	BClick = driver.findElement(By.xpath("(//input)[8]"));	
		BClick.click();
		
		
	}
}
