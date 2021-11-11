package Week2.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindCheckboxCount {
public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leafground.com/pages/checkbox.html");
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		int size=list.size();
		System.out.println(size);
		
	}
}
