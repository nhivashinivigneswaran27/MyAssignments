package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

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
		WebElement com = driver.findElement(By.id("createLeadForm_companyName"));
		com.sendKeys("Dexra Solutions");
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("Nhivashini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govindarajulu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nivi");
		WebElement dep = driver.findElement(By.id("createLeadForm_departmentName"));
		dep.sendKeys("IT Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working as a Test Analyst");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement com1 = driver.findElement(By.id("createLeadForm_companyName"));
		com1.clear();
		com1.sendKeys("TCS");
		WebElement fname1 = driver.findElement(By.id("createLeadForm_firstName"));
		fname1.clear();
		fname1.sendKeys("Klapana");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	}
}
