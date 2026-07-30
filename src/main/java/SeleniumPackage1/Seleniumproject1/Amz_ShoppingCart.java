package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_ShoppingCart 
{
WebDriver driver;
//step1
@FindBy(xpath="(//span[@data-a-selector='increment-icon'])[1]")
WebElement Quantity;
@FindBy(xpath="(//div[contains(@class,'a-stepper-inner-container')]/div/button[contains(@data-action,'a-stepper-decrement')])[1]")
WebElement remove;
@FindBy(xpath="//a[@id='nav-assist-shopping-cart']")
WebElement text;
//step2
public void quan() throws InterruptedException {
	WebDriverWait w2=new WebDriverWait(driver,Duration.ofSeconds(10));
	w2.until(ExpectedConditions.visibilityOf(Quantity)).click();
	Thread.sleep(2000);
	Quantity.click();
	
}
public void removing() {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].click();", remove);
}
//step3
public Amz_ShoppingCart(WebDriver driver) {
	// assign the passed driver to the instance field so methods can use it
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
}
