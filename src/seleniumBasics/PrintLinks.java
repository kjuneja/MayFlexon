package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kunaljuneja/desktop/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/");
		
         List<WebElement> link = driver.findElements(By.tagName("a"));
		
		
		//for(WebElement link:allLinks){
			//System.out.println(link.getText() + " - " + link.getAttribute("href"));
			
		for(int i=0; i<link.size();i++) {
			System.out.println(link.get(i).getText() +  i  +" " + link.get(i).getAttribute("href"));
		}
		}
	}
	


	
	