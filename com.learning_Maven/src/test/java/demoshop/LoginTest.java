package demoshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	@Test(dataProvider = "loginData")
	public void login(String email,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.quit();
	}
	@DataProvider(name = "loginData")
	public Object[][] loginData()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="seeramakshay@gmail.com";
		data[0][1]="Akshay123";
		return data;
	}

}
