package maven.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement Scrollup=driver.findElement(By.xpath("//*[contains(text(),'Handling different types of Alerts using Selenium WebDriver')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",Scrollup); 


         }
	}

