package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_CheckOut 
{
	WebDriver driver;
	
	//step 1
	@FindBy(xpath="(//input[@type='radio'])[5]")
	WebElement radio_btn1;
	@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']")
	WebElement submit_btn;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[7]")
	WebElement radio_btn2;
	@FindBy(xpath="//span[@class='a-button a-button-span12 a-button-primary celwidget  buy-button-height buy-button-sky-fix']")
	WebElement paybtn;
	@FindBy(xpath="(//input[@name='placeYourOrder1'])[3]")
	WebElement placeorder;
	
	
	
	//step 2
	public void radio() {
		radio_btn1.click();
	}
	public void address() {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(submit_btn)).click();
		
		
	}
	public void radio1() {
		WebDriverWait w2=new WebDriverWait(driver,Duration.ofSeconds(10));
		w2.until(ExpectedConditions.visibilityOf(radio_btn2)).click();
	}
	public void payment() {
		WebDriverWait w3=new WebDriverWait(driver,Duration.ofSeconds(10));
		w3.until(ExpectedConditions.visibilityOf(paybtn)).click();
	}
	public void placeOrder() {
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2500)");
		//WebDriverWait w4=new WebDriverWait(driver,Duration.ofSeconds(10));
		//w4.until(ExpectedConditions.visibilityOf(placeorder)).click();
	}
	
	//step 3
	public Amz_CheckOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
