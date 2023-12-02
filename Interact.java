package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ICICI Account420");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Select industry =new Select(driver.findElement(By.name("industryEnumId")));
		industry.selectByIndex(3);
		Select ownership=new Select(driver.findElement(By.name("ownershipEnumId")));
		ownership.selectByVisibleText("S-Corporation");
		Select employee=new Select(driver.findElement(By.id("dataSourceId")));
		employee.selectByValue("LEAD_EMPLOYEE");
		Select ecomm=new Select(driver.findElement(By.id("marketingCampaignId")));
		ecomm.selectByIndex(6);
		Select state=new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		state.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
