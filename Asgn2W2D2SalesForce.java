package Week2.Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asgn2W2D2SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class=\"firstName textFieldInput section\"]//input")).sendKeys("Kamesh");
		driver.findElement(By.xpath("//div[@class=\"lastName textFieldInput section\"]//input")).sendKeys("Manoharan");
		driver.findElement(By.xpath("//div[@class=\"emailInput textFieldInput section\"]//input")).sendKeys("kamesh@seltestcompany.com");
		
		WebElement dropdown_usertitle = driver.findElement(By.xpath("//div[@class=\"userTitle selectFieldInput section\"]//select"));
			Select select_usertitle=new Select(dropdown_usertitle);
			select_usertitle.selectByValue("Operations_Manager_AP");
		driver.findElement(By.xpath("//div[@class=\"company textFieldInput section\"]//input")).sendKeys("SelTestCompany");
		
		WebElement dropdown_emp = driver.findElement(By.xpath("//div[@class=\"companyEmployees selectFieldInput section\"]//select"));
			Select select_emp=new Select(dropdown_emp);
			select_emp.selectByValue("250");
		driver.findElement(By.xpath("//div[@class=\"phoneInput textFieldInput section\"]//input")).sendKeys("+919876543210");
		
		WebElement dropdown_cont = driver.findElement(By.xpath("//div[@class=\"country_field selectFieldInput\"]//select"));
			Select select_cont=new Select(dropdown_cont);
			select_cont.selectByVisibleText("Germany");
			
		WebElement checkbox_click = driver.findElement(By.xpath("//input[@id=\"SubscriptionAgreement\"]/following-sibling::div[1]"));
		driver.executeScript("arguments[0].click();", checkbox_click);
		//driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
	}

}
