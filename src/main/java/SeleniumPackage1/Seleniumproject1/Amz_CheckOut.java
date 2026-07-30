package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.By;
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
	@FindBy(xpath="//a[@aria-label='Change delivery address']")
	WebElement change_btn;
	@FindBy(xpath="//a[@aria-label='Change payment method']")
	WebElement change_btn1;
	@FindBy(xpath="(//i[contains(@class,'a-icon-radio')])[2]")
	WebElement radio_btn1;
	@FindBy(xpath="//input[@data-testid='bottom-continue-button']")
	WebElement submit_btn;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
	WebElement radio_btn2;
	@FindBy(xpath="(//input[@id='placeOrder'])[1]")
	WebElement paybtn;
	@FindBy(xpath="(//input[@id='placeOrder'])[1]")
	WebElement placeorder;
	@FindBy(xpath="//span[text()='No Thanks ']")
	WebElement no_thanks;
	@FindBy(xpath="(//input[contains(@class,'a-button-input')])[3]")
	WebElement payment_method;
	
	
	
	//step 2
	public void change() {
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(change_btn)).click();
	}
	public void change1() {
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", change_btn1);*/
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(30));
		w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@aria-label='Change payment method']")));
		w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Change payment method']")));
		driver.findElement(By.xpath("//a[@aria-label='Change payment method']")).click();
	}
	public void radio() {
		//radio_btn1.click();
		WebDriverWait w4=new WebDriverWait(driver,Duration.ofSeconds(10));
		w4.until(ExpectedConditions.visibilityOf(radio_btn1)).click();
	}
	public void address() {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(submit_btn)).click();
		
		
	}
	public void radio1() {
		// More robust selection for the payment radio (e.g. Cash on Delivery)
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// Prefer locating by label text instead of fragile index. Adjust the text to match the UI.
		By codBy = By.xpath("//label[contains(normalize-space(.),'Cash on Delivery')]/preceding-sibling::input[@name='ppw-instrumentRowSelection']");
		try {
			// wait for the payment options container (adjust locator if needed)
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form|//div[contains(@id,'payment') or contains(@class,'payment')]")));
			// wait for COD option to be present
			WebElement cod = wait.until(ExpectedConditions.presenceOfElementLocated(codBy));
			// ensure clickable
			wait.until(ExpectedConditions.elementToBeClickable(cod));
			try {
				cod.click();
			} catch (Exception e) {
				// fallback to JS click after scrolling into view
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView({block:'center', inline:'center'})", cod);
				js.executeScript("arguments[0].click();", cod);
			}
		} catch (Exception e) {
			// Helpful debugging: capture page source snippet or take screenshot outside this method
			throw new RuntimeException("Failed to select payment radio (COD) - verify locator and that the payment options are visible", e);
		}*/
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
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
