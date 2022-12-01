package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys("Nhivashini");
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if (text.contains("Nhivashini")) {
			System.out.println("Nhivashini is displayed");
		} else
			System.out.println("Print is not diplayed");
		driver.switchTo().defaultContent();
	}

}
