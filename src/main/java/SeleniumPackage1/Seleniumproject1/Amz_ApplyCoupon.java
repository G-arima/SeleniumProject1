package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_ApplyCoupon {
	WebDriver driver;
//step1
@FindBy(xpath="//input[@name='ppw-claimCode']")	
WebElement coupon;
	
@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")	
WebElement ApplyCode;

@FindBy(xpath="//button[@id='a-autoid-2-announce']")
WebElement Apply_Now;
	
	
	
//step2
	
	public void couponcode() {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(coupon)).sendKeys("COOL");
		
	}
	public void apply() {
		WebDriverWait w2=new WebDriverWait(driver,Duration.ofSeconds(10));
		w2.until(ExpectedConditions.visibilityOf(ApplyCode)).click();
	}
	
	
	

//step3
	public Amz_ApplyCoupon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
