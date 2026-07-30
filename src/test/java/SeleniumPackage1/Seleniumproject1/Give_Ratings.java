package SeleniumPackage1.Seleniumproject1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Give_Ratings extends Launch_and_Quit{
    @Test(dataProvider="inputs")
	public void rating(String user,String pass) {
		Amz_HomePage ah=new Amz_HomePage(driver);
		ah.hvover(driver);
		ah.signInButton();
		Amz_LoginPage al=new Amz_LoginPage(driver);
		al.entermobile(user);
		al.btn1();
		al.enterpwd1(pass);
		al.sgnbtn2();
		ah.orderslink();
		Amz_OrderPage op=new Amz_OrderPage(driver);
		op.link();
		op.clear.click();
		op.rating();
		op.create.click();
		Assert.assertEquals(op.clear.isDisplayed(), true);
		
	}
	@DataProvider(name="inputs")
	public Object[][] testdata1() throws EncryptedDocumentException, IOException {
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
