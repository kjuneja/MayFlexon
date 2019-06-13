package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kunaljuneja/desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.com");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//select[@class='gcw-storeable gcw-show-with-value' and @ id ='package-advanced-preferred-class-flp-fh']
		//driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']")).click();
		//WebElement dropdown = driver.findElement(By.xpath("//select[@class='gcw-storeable gcw-show-with-value' and @ id ='package-advanced-preferred-class-hp-package']"));
		
		driver.findElement(By.xpath("//a[contains(text(),'Investor Relations')]")).click();
		//Select sel = new Select(dropdown);
		//sel.selectByValue("f");
	     //sel.deselectByIndex(2);
		//sel.selectByVisibleText("Business");
		
		
		
	}

}
