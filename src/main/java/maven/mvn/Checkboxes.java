package maven.mvn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		List<WebElement> checkbox = driver.findElements(By.xpath("(//*[@class='control-group'])[6]"));

		for (int i = 0; i < checkbox.size(); i++) {
			checkbox.get(i).click();
		}

		for (WebElement e : checkbox) {
			e.click();
		}

	}

}
