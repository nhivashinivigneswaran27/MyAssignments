package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_LeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		/*//Click and confirm new window
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(windows.get(0));
		//find the number of opened tabs
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandle);
		int size = windowHandle.size();
		System.out.println("Number of opened tabs"+size);
		driver.switchTo().window(window.get(2));
		driver.close();
		driver.switchTo().window(window.get(1));
		driver.close();		
		driver.switchTo().window(windows.get(0));*/
		//Close all windows except primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		List<String> window1=new ArrayList<String>(windowHandle1);
		int size1 = window1.size();
		System.out.println(size1);
		for(int i=size1-1;i>0;i--)
		{
			driver.switchTo().window(window1.get(i));
			driver.close();
		}
		driver.switchTo().window(window1.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> window2=new ArrayList<String>(windowHandle2);
		int size2 = window2.size();
		System.out.println(size2);
		driver.quit();
		
		//driver.switchTo().window(window1.get(0));

	}

}
