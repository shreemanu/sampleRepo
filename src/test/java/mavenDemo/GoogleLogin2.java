package mavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLogin2 {
	
	WebDriver driver;
	@BeforeMethod
	public void loginCredentials()
	{
		//WebDriverManager.firefoxdriver().setup();
				//WebDriver driver=new FirefoxDriver();
		 
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://google.com");
		
	}
	
	@Test
	public void login2()
	{
		
		String title=driver.getTitle();
		System.out.println("The title is :"+title);
		Assert.assertEquals(title, "Google");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("abc");
		WebElement btn=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnK']"));
		//btn.click();
		btn.sendKeys(Keys.ENTER);
		
		
	}
	
	@AfterMethod
	public void afterLogin()
	{
		//driver.close();
		driver.quit();
	}
	

}
