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
public class Login_with_invalid_credential extends Launch_and_Quit{

	@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class,dataProvider="inputs")
	public void invalid(String user,String pass) {
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.hvover(driver);
		ah.sgnbutton();
		Amz_LoginPage al=new Amz_LoginPage(driver);
		al.entermobile(user);
		al.btn1();
		al.enterpwd1(pass);
		al.sgnbtn2();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	}
	@DataProvider(name="inputs")
	public Object[][] datainvalid() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\garim\\eclipse-workspace\\MKTSeleniumProject\\DataFetching\\Amazontestdata.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String us=NumberToTextConverter.toText(w1.getSheet("TestData_Amazon").getRow(2).getCell(1).getNumericCellValue());
		String pd=w1.getSheet("TestData_Amazon").getRow(2).getCell(2).getStringCellValue();
		Object[][] d1=new Object[1][2];
		d1[0][0]=us;
		d1[0][1]=pd;
		return d1;
	}
}
