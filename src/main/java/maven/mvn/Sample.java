package maven.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		WebElement courses = driver.findElement(By.xpath("//*[contains(text(),'COURSES')]"));
		Actions obj = new Actions(driver); // object creation-parameterized constructor
		obj.moveToElement(courses).perform(); // method call
		WebElement data = driver.findElement(By.xpath("//*[contains(text(),'Data Science Training')]"));
		obj.moveToElement(data).perform();
		WebElement machine = driver.findElement(By.xpath("//*[(contains(text(),'Machine Learning Training')]"));
		machine.click();

	}

}
