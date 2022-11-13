package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01726s9tfcenpf1bsn9pis5zxhx417425.node0");
		// Select tool
		WebElement to1 = driver.findElement(By.className("ui-selectonemenu"));
		Select tool = new Select(to1);
		tool.selectByVisibleText("Selenium");
		
		// Select Country
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		Thread.sleep(3000);
		
		// Select city
		driver.findElement(By.id("j_idt87:city_label")).click();
		driver.findElement(By.id("j_idt87:city_1")).click();
		Thread.sleep(3000);
	
		//Select Language
		driver.findElement(By.id("j_idt87:lang_label")).click();		
		driver.findElement(By.id("j_idt87:lang_3")).click();
		Thread.sleep(3000);
		
		//Select Values
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.id("j_idt87:value_2")).click();
		
		/*Video
		 * getTitle() getCurrentURL getPageSource getAttribute getCssValue getText
		 * isDisplayed isEnabled isSelected
		 */

	}

}
