package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),' FLIGHTS ')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> str=new ArrayList<String>(windowHandles);
		driver.switchTo().window(str.get(1));
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(str.get(0));
		driver.close();
	
		

	}

}
