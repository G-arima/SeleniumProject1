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
public class Different_Payment_Method extends Launch_and_Quit
{
@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class,dataProvider="inputs")
public void paymethod(String user,String pass,String product,String cardnum,String upitext1,String cvc2) throws InterruptedException {
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
	System.out.println("Reviewing the checkout process");
	Amz_CheckOut ac=new Amz_CheckOut(driver);
	ac.change();
	ac.radio();
	ac.address();
	Amz_PaymentMethod pm=new Amz_PaymentMethod(driver);
	//pm.cc();
	//Thread.sleep(2000);
	pm.AmazonPay();
	pm.cards();
	pm.plussymbol();
	pm.switching(driver);
	pm.card_number.sendKeys(cardnum);
	pm.expirationmonth();
	pm.expirationyear();
	pm.carddetailbtn();
	Assert.assertEquals(pm.incorrectmsg.isDisplayed(), true);
	pm.cancelbtn.click();
	driver.switchTo().defaultContent();
	//pm.cvvdetailme();
	//pm.CVVdetail.sendKeys(cvc2);
	//Thread.sleep(2000);
	
    pm.netbank();
	//pm.radio4.click();
	pm.dd();
	pm.bankname.get(2).click();
	Assert.assertEquals(pm.textofbank.isDisplayed(), true);
	pm.upiapp();
	//pm.upiid.sendKeys(upitext1);
	//pm.btn5_1();
	Assert.assertEquals(pm.btn5.isEnabled(), true);
	pm.cod();
	Assert.assertEquals(pm.payment_btn.isEnabled(), true);
}
@DataProvider(name="inputs")
public Object[][] testdata1() throws EncryptedDocumentException, IOException {
	FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Amazontestdata.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	String userdata=NumberToTextConverter.toText(w1.getSheet("TestData_Amazon").getRow(1).getCell(1).getNumericCellValue());
	String pswrddata=w1.getSheet("TestData_Amazon").getRow(1).getCell(2).getStringCellValue();
	String prod=w1.getSheet("TestData_Amazon").getRow(1).getCell(3).getStringCellValue();
	String cardnumber1=w1.getSheet("TestData_Amazon").getRow(1).getCell(4).getStringCellValue();
	String upitext=w1.getSheet("TestData_Amazon").getRow(1).getCell(5).getStringCellValue();
	String cvv=NumberToTextConverter.toText(w1.getSheet("TestData_Amazon").getRow(1).getCell(6).getNumericCellValue());
	Object[][] d1=new Object[1][6];
	d1[0][0]=userdata;
	d1[0][1]=pswrddata;
	d1[0][2]=prod;
	d1[0][3]=cardnumber1;
	d1[0][4]=upitext;
	d1[0][5]=cvv;
	return d1;
}
}
