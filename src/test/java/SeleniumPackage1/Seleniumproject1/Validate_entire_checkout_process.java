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
public class Validate_entire_checkout_process extends Launch_and_Quit 
{
    @Test(dataProvider="inputs")
	public void checkingOut(String user,String pass,String product) {
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
		//ac.no_thanks.click();
		ac.change();
		ac.radio();
		ac.address();
		//working it address selection, next change button in order to change the payment method that it is unable to click itself
		//ac.change1();
		ac.radio1();
		System.out.println("Reviewing the checkout process");
		ac.payment_method.click();
		//ac.payment();
		Assert.assertEquals(ac.paybtn.isEnabled(), true);
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
		d1[0][2]="plum toner";
		return d1;
	}
}
