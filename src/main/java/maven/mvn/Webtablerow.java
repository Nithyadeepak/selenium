package maven.mvn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablerow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tableRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i <= tableRow.size(); i++) {
			System.out.println(tableRow.get(i).getText());
		}

	}
}
