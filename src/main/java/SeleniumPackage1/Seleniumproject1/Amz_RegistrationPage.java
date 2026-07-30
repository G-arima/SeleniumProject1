package SeleniumPackage1.Seleniumproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_RegistrationPage {
	WebDriver driver;
	//step 1
	
	@FindBy(id="ap_customer_name")
	WebElement firstname;
	
	@FindBy(name="email")
	WebElement Mobile_number;

	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement verify_btn;
	
	//step 2
	
	/*public void fn() {
		
	}
	public void mobile() {
		
	}
	public void pwd() {
		
	}*/
	public void btn()
	{
		verify_btn.click();
	}
	
	//step 3
	public Amz_RegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
