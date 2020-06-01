import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;



public class chromeTest {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sudhanshuj/Documents/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.github.com");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("GitHub"));
		System.out.println("Test Sucessfully passed");
		driver.close();
	}
}
