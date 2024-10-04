package SeleniumPackage1.Seleniumproject1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_logic.class)
public class Edit_Profile_Info extends Launch_and_Quit
{
@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class,dataProvider="inputs")
public void edit1(String user,String pass) throws InterruptedException 
{
	Amz_HomePage ah=new Amz_HomePage(driver);
	ah.hvover(driver);
	ah.sgnbutton();
	Amz_LoginPage al=new Amz_LoginPage(driver);
	al.entermobile(user);
	al.btn1();
	al.enterpwd1(pass);
	al.sgnbtn2();
	Amz_HomePage ah1=new Amz_HomePage(driver);
	ah1.hvover(driver);
	ah1.manage1();
	ah1.view();
	ah1.penicon();
	ah1.input1();
	ah1.button1();
	Assert.assertEquals(true, driver.findElement(By.xpath("//button[@class='edit-pencil-icon-button']")).isDisplayed());
	
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
