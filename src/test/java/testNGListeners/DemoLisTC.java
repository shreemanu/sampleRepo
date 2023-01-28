package testNGListeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoLisTC 
{
	public static WebDriver driver;
	@BeforeMethod
	public void preSet() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://gmail.com");
		
		
	}
	
	@Test(groups="Signin Page")
	public void test1() 
	{
		/*driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rksmshri@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sai2swift!");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		*/
		
	}
	@Test(groups="LoginPage")
	public void test2()
	{
		System.out.println("Test case 2");
		Assert.assertEquals("Correct!!", "Correct!!");
		
	}
	@Test(dependsOnMethods="test2",groups="LoginPage")
	public void test3()
	{
		System.out.println("Test Case 3");
	}
	
	@Test(invocationCount=3)
	public void test4()
	{
		System.out.println("multiple invoke");
	}
	
	
	@AfterMethod
	public void postVerify()
	{
		driver.quit();
		
	}
	
}