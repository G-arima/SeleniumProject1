package SeleniumPackage1.Seleniumproject1;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Updating_and_removing_items_cart extends Launch_and_Quit
{
	@Test(dataProvider="inputs")
	public void shoppingcart(String ip1,String ip2) throws InterruptedException 
	{
		Amz_HomePage ah = new Amz_HomePage(driver);
		ah.searchBar.sendKeys(ip1 + Keys.ENTER);
		Amz_ProductPage pg = new Amz_ProductPage(driver);
		pg.button();
		ah.searchBar.sendKeys(Keys.CONTROL + "A" + Keys.DELETE );
		ah.searchBar.sendKeys(ip2+Keys.ENTER);
		pg.btn1();
		pg.GoCart();
		Amz_ShoppingCart as=new Amz_ShoppingCart(driver);
		as.quan();
		as.removing();
		Amz_ProductPage pg1=new Amz_ProductPage(driver);
		Assert.assertEquals(pg1.proceed.isEnabled(), true);
		
	}
	@DataProvider(name = "inputs")
	public String [][] data1() {
		String [][] values = new String [1][2];
		values[0][0] = "stainless steel feeding bottle";
		values[0][1] = "recode mattifying primer";
		return values;
	}
}
