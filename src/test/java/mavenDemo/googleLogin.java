package mavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleLogin {
	

	
	@BeforeMethod
	public void setBrowser()
	{
		System.out.println("BeforeMethod");
		
	}
	
	
	
	@Test
	public void login()
	{
		System.out.println("Test1");
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("abc");
		WebElement btn=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnK']"));
		//btn.click();
		btn.sendKeys(Keys.ENTER);
		driver.close();
		
		
	}
	
	@AfterMethod
	public void afterLogin()
	{
		System.out.println("After Method");
	}
	

}
