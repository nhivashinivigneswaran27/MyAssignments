package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("DemoSalesManager");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		Thread.sleep(2000);
		//driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dexra Solutions");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nhivashini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govindarajulu");
		WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select s1=new Select(ele);
		s1.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();

	}
}
