package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asgn3W2D2DuplicateLead {
public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()=\"Email\"]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("Kamesh");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println("Page Title: " +driver.getTitle());
		driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
		if (firstname.equals(driver.findElement(By.id("viewLead_firstName_sp")).getText()))
			{
			System.out.println("FirstName: " +firstname +" matches");
			}
		//Close Browser
		//driver.close();
	}
}
