package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_OrderPage {
	WebDriver driver;
	//Step1
	
	@FindBy(xpath="//span[contains(@class,'a-button-inner')]/a[@id='a-autoid-9-announce']")
	WebElement review_link;
	@FindBy(xpath="(//a[contains(@class,'a-size-base-plus')])[2]")
	WebElement review_link_one;
	@FindBy(xpath="//img[@alt='select to rate item five star.']")
	WebElement star;
	@FindBy(xpath="//input[contains(@class,'a-button-input')]")
	WebElement create;
	@FindBy(xpath="//span[@aria-label='Clear']")
	WebElement clear;
	//Step2
	
	public void link() {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(review_link)).click();
		/*WebDriverWait w3=new WebDriverWait(driver,Duration.ofSeconds(10));
		w3.until(ExpectedConditions.visibilityOf(review_link_one)).click();*/
	}
	public void rating() {
		WebDriverWait w2=new WebDriverWait(driver,Duration.ofSeconds(10));
		w2.until(ExpectedConditions.visibilityOf(star)).click();
	}
	
	//Step3
	
	public Amz_OrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
