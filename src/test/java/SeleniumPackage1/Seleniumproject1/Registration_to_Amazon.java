package SeleniumPackage1.Seleniumproject1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Registration_to_Amazon extends Launch_and_Quit{
@Test(dataProvider="inputs")	
public void creating_new_account(String ip1,String ip2, String ip3)
{
	Amz_HomePage ah=new Amz_HomePage(driver);
	ah.hvover(driver);
	ah.signInButton();
	Amz_LoginPage al=new Amz_LoginPage(driver);
	al.entermobile(ip2);
	al.btn1();
	al.createANewAccount();
	Amz_RegistrationPage ar=new Amz_RegistrationPage(driver);
	ar.firstname.sendKeys(ip1);
	//ar.Mobile_number.sendKeys(ip2);
	ar.password.sendKeys(ip3);
	ar.btn();
	Assert.assertEquals(driver.getTitle(), "Authentication required");
}
@DataProvider(name="inputs")
public Object[][] testing(){
	
	Object[][] d1=new Object[1][3];
	d1[0][0]="TestShugar123";
	d1[0][1]="9876123662";
	d1[0][2]="Admin@078";
	return d1;
	
	
}
}
