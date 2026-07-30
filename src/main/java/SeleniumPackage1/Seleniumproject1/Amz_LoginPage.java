package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_LoginPage {
	WebDriver driver;
//Step 1
	@FindBy(xpath="//input[contains(@class,'a-button-input')]")
	WebElement createnewaccount;
	
	@FindBy(xpath="//input[@id='ap_email_login']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continue_btn;
	
	@FindBy(id="ap_password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement Sign_in;
	
	
//Step 2
	public void createANewAccount() {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(createnewaccount)).click();
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
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
