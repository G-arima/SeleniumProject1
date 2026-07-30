package SeleniumPackage1.Seleniumproject1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(Listener_logic.class)

public class Product_Details_Page extends Launch_and_Quit{
	@Test(dataProvider="inputs")
	public void productdetails(String ip) {
	Amz_HomePage ah=new Amz_HomePage(driver);
	ah.searchBar.sendKeys(ip+Keys.ENTER);
	ah.productclick();
	Set<String> s=driver.getWindowHandles();
	Iterator<String> s1=s.iterator();
	String parent_window=s1.next();
	String child_window= s1.next();
	System.out.println(parent_window);
	System.out.println(child_window);
	driver.switchTo().window(child_window);
	Amz_ProductDetails pd=new Amz_ProductDetails(driver);
	pd.price();
	pd.review(driver);
	pd.descripofprod(driver);
	Assert.assertEquals(pd.add.isEnabled(),true);
	}
	@DataProvider(name="inputs")
	public Object[][] data()
	{
		return new Object[][] {{"Sport Shoes for Men"}};
		
	}
}
