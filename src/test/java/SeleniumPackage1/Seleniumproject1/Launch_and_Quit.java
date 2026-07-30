package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

public class Launch_and_Quit extends Listener_logic{
	
	@BeforeMethod
	@Parameters("browser")
	public void launchAmazon(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome")) {
			ChromeOptions co=new ChromeOptions();
			 co.addArguments("--incognito");
	      driver=new ChromeDriver(co);
		}
		if(nameofbrowser.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(12000);
		driver.quit();
	}

}
