package SeleniumPackage1.Seleniumproject1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Login_to_Amazon extends Launch_and_Quit {
	
	@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class,dataProvider="inputs")
	public void login1(String user,String pass) {
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.hvover(driver);
		ah.sgnbutton();
		Amz_LoginPage al=new Amz_LoginPage(driver);
		al.entermobile(user);
		al.btn1();
		al.enterpwd1(pass);
		al.sgnbtn2();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	@DataProvider(name="inputs")
	public Object[][] testData() throws EncryptedDocumentException, IOException
	{
	FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Amazontestdata.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	String userdata=NumberToTextConverter.toText(w1.getSheet("TestData_Amazon").getRow(1).getCell(1).getNumericCellValue());
	String pswrddata=w1.getSheet("TestData_Amazon").getRow(1).getCell(2).getStringCellValue();
	Object[][] d1=new Object[1][2];
	d1[0][0]=userdata;
	d1[0][1]=pswrddata;
	return d1;
	
	}

}
