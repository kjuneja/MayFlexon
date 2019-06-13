package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kunaljuneja/desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		JavascriptExecutor WebDriver = (JavascriptExecutor) driver;
		
		WebDriver.executeScript("document.getElementById('username').setAttribute('value','kunal@gmail.com')");
		WebDriver.executeScript("document.getElementById('password').setAttribute('value','1234')");
		WebDriver.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@id='Login']")));
		
		

		
	}

}
