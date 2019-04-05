package maven.mvn;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Customer ID')]")).click();
		Set<String> childwindow=driver.getWindowHandles();
		for(String window:childwindow);
		{
		System.out.println("child window id is"+window);
		}
		for(String window:childwindow);
		if(!childwindow.equals(parentwindow));
		driver.switchTo().window(window);
		{
			System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//img[@class='imgclass'])[1]")).click();
		
		
		
		
		}
		
		driver.quit();
		
		
		
		
		
	}

}
