package gridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WebshopeGridDemo {
	WebDriver driver;
		
	@Test
	public void startapplication() throws MalformedURLException, InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	//	WebDriver 
	DesiredCapabilities capabilities=DesiredCapabilities.chrome(); 
	capabilities.setBrowserName("chrome");
	capabilities.setPlatform(Platform.WINDOWS);
		
	driver=new RemoteWebDriver(new URL("http://172.24.96.28:4568/wd/hub"),capabilities);
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("pavan.kalluri1997@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("pavan1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Log out")).click();
		driver.close();

	}
}
