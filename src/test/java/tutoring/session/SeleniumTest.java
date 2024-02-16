package tutoring.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver chromeDriver = new ChromeDriver();
		WebDriver firefoxDriver = new FirefoxDriver();
		
		test(chromeDriver);
		test(firefoxDriver);

	}

	public static void test(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
