package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kunaljuneja/desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///Users/kunaljuneja/Downloads/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");
		
		JavascriptExecutor WebDriver = (JavascriptExecutor) driver;
		
		WebElement Element = driver.findElement(By.xpath("//button[@type='reset']"));
		WebElement Element1 = driver.findElement(By.xpath("//input[@name='textbox1']"));
		
		WebDriver.executeScript("arguments[0].scrollIntoView();", Element);
		WebDriver.executeScript("arguments[0].scrollIntoView();", Element1);
		

}
}