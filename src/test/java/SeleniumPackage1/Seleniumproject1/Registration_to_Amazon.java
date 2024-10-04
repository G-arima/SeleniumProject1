package SeleniumPackage1.Seleniumproject1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Registration_to_Amazon extends Launch_and_Quit{
@Test(retryAnalyzer=SeleniumPackage1.Seleniumproject1.Retry_Logic.class)	
public void creating_new_account()
{
	Amz_HomePage ah=new Amz_HomePage(driver);
	ah.hvover(driver);
	ah.sgnbutton();
	Amz_LoginPage al=new Amz_LoginPage(driver);
	al.cna();
	Amz_RegistrationPage ar=new Amz_RegistrationPage(driver);
	ar.fn();
	ar.mobile();
	ar.pwd();
	ar.btn();
	Assert.assertEquals(driver.getTitle(), "Authentication required");
}
}
