package learn.CANADA_AUTOMATION;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Open_Browser {
	public static WebDriver driver;        
	public static void main(String[] args)
	
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		driver.quit();
		
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("http://facebook.com");
		driver1.quit();
		
		WebDriver driver2 =new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("http://google.com");
		driver.quit();
		
		
	}

}
