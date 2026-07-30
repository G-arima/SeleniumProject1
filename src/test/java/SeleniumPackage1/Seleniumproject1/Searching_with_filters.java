package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Searching_with_filters extends Launch_and_Quit{
	
	@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class,dataProvider="testdata")
	public void filters(String input) throws InterruptedException {
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.searchBar.sendKeys(input+Keys.ENTER);
		Thread.sleep(10000);
		//ah.delivery1();
		//ah.brand1();
		//ah.gender1();
		//ah.cat1();
		ah.size1();
		ah.deals();
		
		//ah.price1();
		
		
		Assert.assertTrue(driver.findElement(By.xpath("(//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold'])[1]")).isDisplayed());
		
		
		
		
		/*WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='a-label a-checkbox-label'])[14]")));*/
		
		//Thread.sleep(1000);
		
		
	}
	@DataProvider(name="testdata")
	public Object[][] searching(){
		return new Object[][] {{"shoe"}};
	}


}
