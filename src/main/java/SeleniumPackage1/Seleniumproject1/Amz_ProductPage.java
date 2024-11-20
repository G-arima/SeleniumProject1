package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_ProductPage {
	WebDriver driver;
	//step1
	@FindBy(xpath="//button[@id='a-autoid-1-announce']")
	WebElement Add_to_cart;
	@FindBy(xpath="(//button[@class='a-button-text'])[3]")
	WebElement Add_to_cart1;
	@FindBy(xpath="//span[@class='a-button a-button-span11 a-button-base a-button-small']")
	WebElement Go;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed;
	@FindBy(xpath="//button[@id='a-autoid-5-announce']")
	WebElement add1;
	//step2
	public void button() throws InterruptedException {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(Add_to_cart)).click();
		//Add_to_cart.click();
	}
	public void btn1() throws InterruptedException {
		//Thread.sleep(2000);
		WebDriverWait w2=new WebDriverWait(driver,Duration.ofSeconds(10));
		w2.until(ExpectedConditions.visibilityOf(Add_to_cart1)).click();
		//Add_to_cart1.click();
	}
	public void GoCart() {
		WebDriverWait w3=new WebDriverWait(driver,Duration.ofSeconds(5));
		w3.until(ExpectedConditions.visibilityOf(Go)).click();
	}
	public void btn2() {
		WebDriverWait w4=new WebDriverWait(driver,Duration.ofSeconds(10));
		w4.until(ExpectedConditions.visibilityOf(add1)).click();
	}
	//step3
	public Amz_ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
