package AssignmentWeek5.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SNAPDEAL {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement Men = driver.findElement(By.linkText("Men's Fashion"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Men).perform();
		
		driver.findElement(By.className("linkTest")).click();
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(text);
		
		
	

	}

}
