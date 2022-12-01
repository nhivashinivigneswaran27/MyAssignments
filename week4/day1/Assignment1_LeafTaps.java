package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_LeafTaps {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		// 2. Enter UserName and Password Using Id Locator
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("DemoSalesManager");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		// 4. Click on CRM/SFA Link
		driver.findElement(By.id("label")).click();

		// 5. Click on contacts Button

		driver.findElement(By.linkText("Contacts")).click();

		// 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Merge Contacts']")).click();

		// 7. Click on Widget of From Contact

		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();

		Set<String> win = driver.getWindowHandles();
		List<String> win1 = new ArrayList<String>(win);
		System.out.println(win1);
		driver.switchTo().window(win1.get(1));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(win1.get(0));
		// 9. Click on Widget of To Contact
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win2 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(win2.get(1));
		// 10. Click on Second Resulting Contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();

		driver.switchTo().window(win2.get(0));
		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.linkText("Merge")).click();
		// 12. Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// 13. Verify the title of the page*/
		System.out.println(driver.getTitle());


	}

}
