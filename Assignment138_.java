package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//WAP to Sign For Amazon.india  Using Relative Xpath

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment138_ {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		driver.manage().window().maximize();
		
		WebElement Ename = driver.findElement(By.xpath("(//input)[6]"));   //("(//input)[5]"))
		Ename.sendKeys("pasikantiabhilash@gmail.com");
		
		WebElement Pname = driver.findElement(By.xpath("(//input)[8]"));   //("(//input)[5]"))
		Pname.sendKeys("9866093612Abhi!");
		
		WebElement Sbutton = driver.findElement(By.xpath("(//input)[9]"));
		Sbutton.click();
		
		driver.quit(); 
	}

}
