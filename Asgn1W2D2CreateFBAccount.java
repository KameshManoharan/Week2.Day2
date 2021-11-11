package Week2.Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asgn1W2D2CreateFBAccount {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Thread.sleep(2000);
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//Thread.sleep(2000);
		
		//Enter the First Name
		driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("FirstName");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("LastName");
				
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("+919876543210");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@aria-label=\"New password\"]")).sendKeys("Password@1");
		
		//Select Dropdown Value Day
		WebElement dropdown_day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select select_day=new Select(dropdown_day);
		select_day.selectByValue("20");
		
		//Select Dropdown Value Month
		WebElement dropdown_month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select select_month=new Select(dropdown_month);
		select_month.selectByVisibleText("Oct");
		
		//Select Dropdown Value Year
		WebElement dropdown_year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select select_year=new Select(dropdown_year);
		select_year.selectByVisibleText("1994");
				
		//Click Create Contact Button
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		
		//Close Browser
		//driver.close();
	}
}
