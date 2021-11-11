package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactWithCurrency {
public static void main(String[] args) {
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
		
		//Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Type First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Kamesh_Currency");
		
		//Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Manoharan");
		
		//Select Dropdown Value for Currency Field
		WebElement dropdown_cur = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select select_cur=new Select(dropdown_cur);
		select_cur.selectByVisibleText("INR - Indian Rupee");
		
		//Select Dropdown Value for Country Field
		WebElement dropdown_con = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select select_con=new Select(dropdown_con);
		select_con.selectByValue("IND");
		
		//Type Email
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kamesh@testcompany.com");
				
		//Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		
		//Close Browser
		//driver.close();
	}
}
