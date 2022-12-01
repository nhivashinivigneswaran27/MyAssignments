package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Shirts']"));
		action.moveToElement(element).click(element1).perform();
		WebElement element2 = driver.findElement(By.xpath("//div[@class='product-tuple-image ']//picture[@class='picture-elem']"));
		WebElement element3 = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
		action.moveToElement(element2).click(element3).perform();
		System.out.println(driver.getTitle());
	}

}
