package SeleniumPackage1.Seleniumproject1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Search_for_product extends Launch_and_Quit{
	
	@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class)
	public void search1() {
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.search();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe");
	}

}
