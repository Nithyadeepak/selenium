package maven.mvn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		driver.switchTo().frame(0);
		// WebElement fullname = driver.findElement(By.xpath("//*[@name='firstname']"));
		// fullname.sendKeys("deepak");
		// driver.switchTo().frame("iframe");
		WebElement fullname = driver.findElement(By.xpath("//*[@name='firstname']"));
		fullname.sendKeys("deepak");

	}
}
