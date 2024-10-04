package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_HomePage {
	WebDriver driver;
	//step1
	@FindBy(xpath="//span[text()='Account & Lists']")
	WebElement Account_and_List;
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	WebElement Signin_button;
	
	@FindBy(xpath="//button[text()='Manage Profiles']")
	WebElement Manage_Profiles1;
	
	@FindBy(xpath="//a[text()='View']")
	WebElement view_link;
	
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement pencil;
	
	@FindBy(xpath="//input[@id='editProfileNameInputId']")
	WebElement input;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement btn1;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBar;
	
	@FindBy(xpath="//span[text()='Shoes']")
	WebElement category;
	
	@FindBy(xpath="(//span[text()='Skechers'])[2]")
	WebElement Brands;
	
	@FindBy(xpath="//span[@id='a-autoid-73']")
	WebElement size_of_shoe;
	
	@FindBy(xpath="(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[2]")
	WebElement delivery_day;
	//step2
	public void hvover(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(Account_and_List).perform();
		
	}
	
	public void sgnbutton()
	{
		Signin_button.click();
	}
	
	public void manage1() {
		Manage_Profiles1.click();
	}
	
	public void view() throws InterruptedException {
		Thread.sleep(1000);
		view_link.click();
	}
	
	public void penicon() {
		pencil.click();
	}
	
	public void input1() throws InterruptedException {
		input.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		input.sendKeys("i");
		
	}
	
	public void button1() {
		btn1.click();
	}
	
	public void search() {
		searchBar.sendKeys("shoe" +Keys.ENTER);
	}
	
	public void cat1() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(category)).click();
		//category.click();
	}
	
	public void brand1() {
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOf(Brands)).click();
		//Brands.click();
	}
	public void size1() {
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait2.until(ExpectedConditions.visibilityOf(size_of_shoe)).click();
	}
	public void delivery1() {
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait3.until(ExpectedConditions.visibilityOf(delivery_day)).click();
	}
	
	//step3
	public Amz_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
