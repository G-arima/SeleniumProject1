package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Searching_with_filters extends Launch_and_Quit{
	
	@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class)
	public void filters() throws InterruptedException {
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.search();
		Thread.sleep(2000);
		ah.delivery1();
		ah.brand1();
		ah.cat1();
		//ah.size1();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe");
		
		
		
		
		/*WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='a-label a-checkbox-label'])[14]")));*/
		
		//Thread.sleep(1000);
		
		
	}

}
