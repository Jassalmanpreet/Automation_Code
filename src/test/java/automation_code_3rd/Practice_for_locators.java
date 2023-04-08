package automation_code_3rd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_for_locators {
	

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	//driver.manage().window().fullscreen();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoqa.com/");
	driver.findElement(By.className("card-up")).click();
	driver.findElement(By.id("item-0")).click();
	driver.findElement(By.className("element-list collapse")).click();
	driver.findElement(By.className("text")).click();
	driver.findElement(By.id("userName")).sendKeys("Manpreet kaur");
	driver.findElement(By.id("userEmail-wrapper")).sendKeys("Preetkaler@gmail.com");
	driver.findElement(By.id("currentAddress")).sendKeys("45 blvd crescent");
	driver.findElement(By.id("permanentAddress")).sendKeys("4587 flenn");
	driver.findElement(By.id("submit")).click();

	
	//Thread.sleep(2000);
	
	
	
	
	//driver.quit();
	
	}

}
