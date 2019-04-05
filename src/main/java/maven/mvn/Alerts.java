package maven.mvn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		WebElement SimpleAlert = driver.findElement(By.xpath("//*[contains(text(),'Simple Pop up')]"));
		SimpleAlert.click();
		Alert c = driver.switchTo().alert();
		c.accept();
		WebElement ConfirmAlert = driver.findElement(By.xpath("//*[contains(text(),'Confirm Pop up')]"));
		ConfirmAlert.click();
		Alert d = driver.switchTo().alert();
		d.accept();
		WebElement PromptAlert = driver.findElement(By.xpath("//*[contains(text(),'Prompt Pop up')]"));
		PromptAlert.click();
		Alert e = driver.switchTo().alert();
		e.sendKeys("No");
		e.dismiss();

		
	}

}
