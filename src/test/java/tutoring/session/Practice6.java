package tutoring.session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//Not Working
public class Practice6 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://medium.com/search");
		
		WebElement input = driver.findElement(By.cssSelector("input[data-testid=headerSearchInput]"));
		input.sendKeys("Java");
		input.sendKeys(Keys.ENTER);
		
		Thread.sleep(20000);
		
		List<WebElement> titles = driver.findElements(By.cssSelector("h2.be.me.mf"));
		List<WebElement> claps = driver.findElements(By.cssSelector("div.nn.h.k.i div.ab.q.cc"));
		List<WebElement> comments = driver.findElements(By.cssSelector("div.nn.h.k.i div.os.l"));
		
		System.out.println(titles.size());
		for (int i = 0; i <titles.size(); i++) {
			System.out.println("Title: " + titles.get(i).getText());
			System.out.println("Comment: " + comments.get(i).getText());
			System.out.println("Clap: " + claps.get(i).getText());
		}
		
		Thread.sleep(3000);
		 driver.quit();
	}
}