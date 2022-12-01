package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.id("txtStationFrom"));
		ele.clear();
		ele.sendKeys("Mas", Keys.ENTER);
		WebElement ele2 = driver.findElement(By.id("txtStationTo"));
		ele2.clear();
		ele2.sendKeys("cbe", Keys.ENTER);

		List<WebElement> li = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]"));
		int size = li.size();
		System.out.println(size);
		List<String> str1 = new ArrayList<String>();
		for (WebElement webElement : li) {
			String text = webElement.getText();
			str1.add(webElement.getText());	
			System.out.println(text);
		}
		int n = str1.size();	
		Set<String> str2 = new HashSet<String>(str1);
		System.out.println(str2);
		int n1 = str2.size();
		System.out.println(n1);
		if (size == n1) {
			System.out.println("correct");
		} else {
			System.out.println("duplicates");
		}

	}

}
