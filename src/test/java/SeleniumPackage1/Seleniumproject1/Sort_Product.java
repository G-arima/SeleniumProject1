package SeleniumPackage1.Seleniumproject1;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_logic.class)

public class Sort_Product extends Launch_and_Quit{
	
	@Test(dataProvider="testdata")
	public void sorting(String input1) throws InterruptedException 
	{
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.searchBar.sendKeys(input1+Keys.ENTER);
		ah.drop();
		Assert.assertEquals(ah.results.isDisplayed(), true);
	}
	@DataProvider(name="testdata")
	public Object[][] searching(){
		return new Object[][] {{"shoe"}};
	}

	

}
