package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_ProductDetails 
{
	WebDriver driver;
	//Step 1
	@FindBy(xpath="(//span[text()='2,219'])[1]")
	WebElement price_of_item;
	@FindBy(xpath="(//i[@class='a-icon a-icon-star a-star-3-5 cm-cr-review-stars-spacing-big'])[1]")
	WebElement reviews_on_prod;
	@FindBy(xpath="//h2[text()=' Product description  ']")
	WebElement product_des;
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	WebElement add;
	
	// Step 2
	public void price() {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(price_of_item)).isDisplayed();
	}
	public void review(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(reviews_on_prod).perform();
	}
	public void descripofprod(WebDriver driver) {
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,2500)");
		product_des.isDisplayed();
	}
	//Step 3
public	Amz_ProductDetails(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
