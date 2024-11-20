package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_PaymentMethod 
{
	WebDriver driver;
//Step1
@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")	
WebElement radio1;
	
@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
WebElement radio2;
	
@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
WebElement radio3;

@FindBy(xpath="//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")
WebElement plus;

@FindBy(xpath="//iframe[@name='ApxSecureIframe']")
WebElement frame1;

@FindBy(xpath="//input[@name='addCreditCardNumber']")
WebElement card_number;

@FindBy(xpath="//select[@name='ppw-expirationDate_month']")
WebElement expiry_month;

@FindBy(xpath="//select[@name='ppw-expirationDate_year']")
WebElement expiry_year;

@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
WebElement card_detail;

@FindBy(xpath="//span[text()='Card number is not correct.']")
WebElement incorrectmsg;

@FindBy(xpath="//input[@class='card-cvv']")
WebElement CVVdetail;

@FindBy(xpath="//button[@name='ppw-widgetEvent:CancelAddCreditCardEvent']")
WebElement cancelbtn;

@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
WebElement radio4;

@FindBy(xpath="//span[text()='Choose an Option']")
WebElement drop1;

@FindBy(xpath="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']/ul/li")
List<WebElement> bankname;

@FindBy(xpath="//span[text()='HDFC Bank']")
WebElement textofbank;

@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
WebElement radio5;

@FindBy(xpath="//input[@placeholder='Enter UPI ID']")
WebElement upiid;

@FindBy(xpath="(//span[@class='a-button-text'])[3]")
WebElement btn5;

@FindBy(xpath="//div[text()='Verified!']")
WebElement msg;

@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[7]")
WebElement radio6;

@FindBy(xpath="(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]")
WebElement payment_btn;
	
	
//Step2
public void cc() {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(radio1)).click();
}
public void AmazonPay() {
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait1.until(ExpectedConditions.visibilityOf(radio2)).click();
}
public void cards() {
	WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait2.until(ExpectedConditions.visibilityOf(radio3)).click();
}
public void plussymbol() {
	plus.click();
	
}
public void switching(WebDriver driver) throws InterruptedException {
	//Thread.sleep(5000);
	driver.switchTo().frame(frame1);	
}

public void expirationmonth() {
	Select s1=new Select(expiry_month);
	s1.selectByValue("12");
	}
public void expirationyear() {
	Select s2=new Select(expiry_year);
	s2.selectByVisibleText("2030");
}
public void carddetailbtn() {
	WebDriverWait wait6=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait6.until(ExpectedConditions.visibilityOf(card_detail)).click();
}
public void cvvdetailme() {
	WebDriverWait wait8=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait8.until(ExpectedConditions.visibilityOf(CVVdetail));
}
public void netbank() {
	WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait3.until(ExpectedConditions.visibilityOf(radio4)).click();
}
public void dd() {
	WebDriverWait wt1=new WebDriverWait(driver,Duration.ofSeconds(10));
	wt1.until(ExpectedConditions.visibilityOf(drop1)).click();
	
}
public void upiapp() {
	WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait4.until(ExpectedConditions.visibilityOf(radio5)).click();
}
public void btn5_1() {
	WebDriverWait wait7=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait7.until(ExpectedConditions.visibilityOf(btn5)).click();
}
public void cod() {
	WebDriverWait wait5=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait5.until(ExpectedConditions.visibilityOf(radio6)).click();
}
	
	
	
	
//Step3
public Amz_PaymentMethod(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
