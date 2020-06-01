import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeTest {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sudhanshuj/Documents/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.github.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Test Sucessfully passed");
		driver.close();
	}
}
