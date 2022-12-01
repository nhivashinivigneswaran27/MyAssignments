package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement2_Frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
		WebElement element = driver.findElement(By.xpath("//b[contains(text(),'Topic :')]/following-sibling::input"));
		element.sendKeys("Science");
		driver.switchTo().defaultContent();
		 /*WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(10000));
		  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame3"));
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame3']")));
		driver.findElement(By.xpath("//b[contains(text(),\"Inner Frame Check box :\")]/following-sibling::input"))
				.click();
		driver.switchTo().defaultContent();*/
		driver.switchTo().frame("frame2");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s1 = new Select(findElement);
		s1.selectByIndex(1);
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		firstSelectedOption.getText();
		System.out.println(firstSelectedOption.getText());

	}

}
