package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kunaljuneja/desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jquery-drag-drop-demo.webflow.io/");
		
		//implicit wait in selenium
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//alternate is thread.sleep
		
		//driver.switchTo().frame(0);
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.
		clickAndHold(sourceElement).
		moveToElement(targetElement).
		release().
		build().
		perform();
		
		
		
		
		
		
	}
	
	

}
