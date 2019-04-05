package maven.mvn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablebymethods {
	static WebDriver driver = null;

	public void IteratingTableRow() {
		System.out.println("IteratingTableRow");

		List<WebElement> tableRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tableRow.size(); i++) {
			System.out.println(tableRow.get(i).getText());
		}
	}

	public void IteratingTableData() {
		System.out.println("IteratingTableData");

		List<WebElement> tableData = driver.findElements(By.tagName("td"));
		for (WebElement td : tableData)

		{
			System.out.println(td.getText());
		}
	}

	public void IteratingTheParticularTableRow() {
		System.out.println("IteratingTheParticularTableRow");

		WebElement particulartableRow = driver.findElement(By.xpath("(//tr[1])"));
		{
			System.out.println(particulartableRow.getText());
		}
	}

	public void IteratingTheParticularTableData() {
		System.out.println("IteratingTheParticularTableData");

		WebElement particulartableData = driver.findElement(By.xpath("//td[2][contains(text(),'Mecca')]"));
		{
			System.out.println(particulartableData.getText());
		}

	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithy\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();

		Webtablebymethods tab = new Webtablebymethods();
		tab.IteratingTableRow();
		tab.IteratingTableData();
		tab.IteratingTheParticularTableRow();
		tab.IteratingTheParticularTableData();

	}

}
