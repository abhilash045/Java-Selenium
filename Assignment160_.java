package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WAP to handle fileupload https://grotechminds.com/registration/ ?

public class Assignment160_ {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");

		driver.manage().window().maximize();

		WebElement w1 = driver.findElement(By.id("fname"));
		w1.sendKeys("Abhilash");

		WebElement w2 = driver.findElement(By.id("lname"));
		w2.sendKeys("pasikanti");

		WebElement w3 = driver.findElement(By.id("email"));
		w3.sendKeys("abhilash.var5@gmail.com");

		WebElement w4 = driver.findElement(By.id("password"));
		w4.sendKeys("Abhilash");

		WebElement w5 = driver.findElement(By.id("male"));
		w5.click();

		WebElement skills = driver.findElement(By.id("Skills"));

		Select s = new Select(skills);

		s.selectByVisibleText("Technical Skills");

		WebElement technicalskills = driver.findElement(By.id("technicalskills"));

		Select s1 = new Select(technicalskills);

		s1.selectByVisibleText("Python");
		
		

		WebElement Country = driver.findElement(By.id("Country"));

		Select s2 = new Select(Country);

		s2.selectByVisibleText("China");
		
		
		WebElement w7 = driver.findElement(By.id("Present-Address"));
		w7.sendKeys("Hyderabad");
		
		WebElement w8 = driver.findElement(By.id("Permanent-Address"));
		w8.sendKeys("Hyderabad");
		
		WebElement w9 = driver.findElement(By.id("Pincode"));
		w8.sendKeys("506003");
		
		WebElement w10 = driver.findElement(By.id("Relegion"));
		
		Select s4 = new Select(w10);
		
		s4.selectByVisibleText("Hindu");

		WebElement w11 = driver.findElement(By.id("file"));
		
		w11.sendKeys("C:\\Users\\USER\\OneDrive\\Desktop\\Resums");
		
		WebElement w12 = driver.findElement(By.id("relocate"));
		w12.click();
		

	}

}
