package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumSelectors {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kunaljuneja/desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		//driver.findElement(By.id("username")).sendKeys("email@gmail.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("email@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		//driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
	}
	

}
