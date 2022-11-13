package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

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
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dexra Solutions"); // TODO Auto-generated
																								// method stub
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nhivashini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govindarajulu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nivi");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working as a Test Analyst");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nhivashinivigneswaran@gmail.com");
		WebElement sta = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(sta);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());

	}

}
