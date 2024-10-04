package SeleniumPackage1.Seleniumproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_LoginPage {
	WebDriver driver;
//Step 1
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement createnewaccount;
	
	@FindBy(id="ap_email")
	WebElement mobile;
	
	@FindBy(id="continue")
	WebElement continue_btn;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement Sign_in;
	
	
//Step 2
	public void cna() {
		createnewaccount.click();
	}
	
	public void entermobile(String user) {
		mobile.sendKeys(user);
	}
	
	public void btn1() {
		continue_btn.click();
	}
	
	public void enterpwd1(String pswrd) {
		pwd.sendKeys(pswrd);
	}
	
	public void sgnbtn2() {
		Sign_in.click();
	}
	
	
	
//Step 3
	
	public Amz_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
