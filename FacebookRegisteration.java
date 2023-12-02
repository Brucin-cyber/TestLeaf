package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegisteration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tester");
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		driver.findElement(By.name("reg_email__")).sendKeys("tester@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Tester@123");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(10);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("8");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1990");
		
	}

}
