package week4.day1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.mongodb.MapReduceCommand.OutputType;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment4_Amazon {

	public static void main(String[] args) throws IOException {

//1.Load the URL https://www.amazon.in/
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
//2.search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
//3.Get the price of the first product

		WebElement text = driver.findElement(By.xpath("//span[@class='a-price-whole']"));

		String tx = text.getText().replace(",", "");
		int in11 = Integer.parseInt(tx);
		System.out.println(in11);

//4. Print the number of customer ratings for the first displayed product

		WebElement text2 = driver
				.findElement(By.xpath("//span[contains(@class,'a-size-base puis-light-weight-text')]"));

		String tx1 = text2.getText().replace(",", "");
		int in1 = Integer.parseInt(tx1);
		System.out.println(in1);

//5. Click the first text link of the first image

		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[2]")).click();
//6. Take a screen shot of the product displayed
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));

		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"a-page\"]"));

		// File SrcFile =
		// findElement.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		// File DestFile = new
		// File("C:\\Users\\Nhivashini\\Desktop\\screenshot1\\file.png");
		// FileUtils.copyFile(SrcFile, DestFile);
//7. Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.linkText("Go to Cart")).click();
//8. Get the cart subtotal and verify if it is correct.
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id='sc-subtotal-amount-activecart']/span"));
		String str = findElement2.getText().replace(",", "");
		int in = (int) Double.parseDouble(str);
		System.out.println(in);
		if (in11 == in) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		}

//9.close the browser

	}

}
