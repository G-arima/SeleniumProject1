package SeleniumPackage1.Seleniumproject1;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_logic.class)
public class Add_Items_to_shopping_cart extends Launch_and_Quit {
	
	@Test(dataProvider = "inputs")
	public void addtocart(String ip1, String ip2) throws InterruptedException {
		Amz_HomePage ah = new Amz_HomePage(driver);
		ah.searchBar.sendKeys(ip1 + Keys.ENTER);
		Amz_ProductPage pg = new Amz_ProductPage(driver);
		pg.button();
		ah.searchBar.sendKeys(Keys.CONTROL + "A" + Keys.DELETE );
		ah.searchBar.sendKeys(ip2+Keys.ENTER);
		pg.btn1();
		pg.GoCart();
		Assert.assertEquals(pg.proceed.isDisplayed(), true);
	}

	@DataProvider(name = "inputs")
	public String [][] data1() {
		String [][] values = new String [1][2];
		values[0][0] = "stainless steel feeding bottle";
		values[0][1] = "recode mattifying primer";
		return values;
	}

}
