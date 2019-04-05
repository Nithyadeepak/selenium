package maven.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id='sex-0']"));radiobutton.click();
	    
	
		
		
		
				
		
		
		
	}
	

}
