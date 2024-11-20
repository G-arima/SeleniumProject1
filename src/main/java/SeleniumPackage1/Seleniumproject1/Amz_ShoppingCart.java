package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

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
@FindBy(xpath="//select[@id='quantity']")
WebElement Quantity;
@FindBy(xpath="(//input[@class='a-color-link'])[1]")
WebElement remove;
@FindBy(xpath="(//span[text()=' was removed from Shopping Cart. '])[1]")
WebElement text;
//step2
public void quan() {
	Select s1=new Select(Quantity);
	s1.selectByVisibleText("3");
}
public void removing() {
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
	w1.until(ExpectedConditions.visibilityOf(remove)).click();
}
//step3
public Amz_ShoppingCart(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
