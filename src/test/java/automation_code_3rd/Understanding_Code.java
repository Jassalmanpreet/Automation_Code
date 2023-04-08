package automation_code_3rd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().window().minimize();
		//driver.manage().timeouts().scriptTimeout(Duration.of )
		
		
		String expectedTitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle=driver.getTitle();
		
		String expectedCurrentUrl="https://ww.rediff.com/";
		String actualCurrentUrl=driver.getCurrentUrl();
			
		if(expectedTitle.equals(actualTitle)&& expectedCurrentUrl.equals(actualCurrentUrl)) 
		{
			System.out.println("My url is correct ");
		}
		else
		{
			System.out.println("My url is not coorect ");
		}
		
		WebElement signInLink=driver.findElement(By.linkText("SignIn"));
		
	}

}
