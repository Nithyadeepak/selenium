package maven.mvn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeglobe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		// driver.switchTo().frame("google_shimpl");
		// WebElement subscribe =
		// driver.findElement(By.id("custom_field_submit_1016376"));
		// subscribe.click();
		driver.switchTo().frame("globalSqa");
		WebElement subscribe = driver.findElement(By.id("custom_field_submit_1016376"));
		subscribe.click();

	}
}
