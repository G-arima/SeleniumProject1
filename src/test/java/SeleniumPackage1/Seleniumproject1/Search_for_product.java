package SeleniumPackage1.Seleniumproject1;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Search_for_product extends Launch_and_Quit{
	
	@Test(dataProvider="testdata")
	public void search1(String inp) throws InterruptedException {
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.searchBar.sendKeys(inp+Keys.ENTER);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe");
	}
	@DataProvider(name="testdata")
	public Object[][] searching(){
		return new Object[][] {{"shoe"}};
	}

}
