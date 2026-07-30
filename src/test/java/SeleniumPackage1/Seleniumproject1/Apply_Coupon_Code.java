package SeleniumPackage1.Seleniumproject1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Apply_Coupon_Code extends Launch_and_Quit{
	
	@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class,dataProvider="inputs")

	public void applyingcoup(String user, String pass, String product) {
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.hvover(driver);
		ah.signInButton();
		Amz_LoginPage al=new Amz_LoginPage(driver);
		al.entermobile(user);
		al.btn1();
		al.enterpwd1(pass);
		al.sgnbtn2();
		ah.searchBar.sendKeys(product+Keys.ENTER);
		Amz_ProductPage pp=new Amz_ProductPage(driver);
		pp.btn2();
		pp.GoCart();
		pp.proceed.click();
		Amz_CheckOut ac=new Amz_CheckOut(driver);
		ac.change();
		ac.radio();
		ac.address();
		System.out.println("Reviewed the checkout process");
		Amz_ApplyCoupon ac1=new Amz_ApplyCoupon(driver);
		ac1.couponcode();
		ac1.apply();
		Assert.assertEquals(ac1.ApplyCode.isEnabled(), true);
	}
	@DataProvider(name="inputs")
	public Object[][] testdata1() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Amazontestdata.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String userdata=NumberToTextConverter.toText(w1.getSheet("TestData_Amazon").getRow(1).getCell(1).getNumericCellValue());
		String pswrddata=w1.getSheet("TestData_Amazon").getRow(1).getCell(2).getStringCellValue();
		Object[][] d1=new Object[1][3];
		d1[0][0]=userdata;
		d1[0][1]=pswrddata;
		d1[0][2]="mamaearth vitamin c facewash";
		return d1;
	}
}
