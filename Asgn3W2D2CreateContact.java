package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asgn3W2D2CreateContact {
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("KameshTwo");
		driver.findElement(By.id("lastNameField")).sendKeys("LastName");
		
		WebElement dropdown_cur = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
			Select select_cur=new Select(dropdown_cur);
			select_cur.selectByVisibleText("INR - Indian Rupee");
		
		WebElement dropdown_con = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
			Select select_con=new Select(dropdown_con);
			select_con.selectByValue("IND");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kamesh2@testcompany.com");
		driver.findElement(By.name("submitButton")).click();
		
		//Close Browser
		//driver.close();
	}
}