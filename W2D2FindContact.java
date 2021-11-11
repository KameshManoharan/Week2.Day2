package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W2D2FindContact {
public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Enter UserName
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//Type first name with your name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kamesh");
		
		//Click Find Contacts
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		
		//Wait for 5 Seconds
		Thread.sleep(5000);
		
		//Print the first contact id
		String contactID = 
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(contactID);
		
		//Click on the first matching contact id
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
		//Close Browser
		//driver.close();
	}
}
