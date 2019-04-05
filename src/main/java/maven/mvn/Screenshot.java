package maven.mvn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("c:/newscreenshot.png");
		FileUtils.copyFile(screenshotAs, f);

	}
}
