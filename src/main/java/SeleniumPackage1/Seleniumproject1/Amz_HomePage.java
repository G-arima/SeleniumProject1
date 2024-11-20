package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement btn1;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBar;
	
	@FindBy(linkText="Men's Casual Shoes")
	WebElement category;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[3]")
	WebElement Brands;
	
	@FindBy(xpath="(//button[@class='a-button-text a-text-center'])[11]")
	WebElement size_of_shoe;
	
	@FindBy(xpath="(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[2]")
	WebElement delivery_day;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement price;
	
	@FindBy(xpath="//span[text()='Sport Shoes for Men |Cultured Round-Toe Shape, Cushioning Technology & Smart Ventilation']")
	WebElement product_link;
	
	@FindBy(xpath="//select[@id='s-result-sort-select']")
	WebElement drop_down;
	@FindBy(xpath="//h2[text()='Results']")
	WebElement results;
	@FindBy(xpath="//a[@id='nav-orders']")
	WebElement orders;
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
		Thread.sleep(2000);
		input.sendKeys("i");
		
	}
	
	public void button1() {
		btn1.click();
	}
	
	public void search() {
		//searchBar.sendKeys("Sport Shoes for Men |Cultured Round-Toe Shape, Cushioning Technology & Smart Ventilation" +Keys.ENTER);
		//searchBar.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		
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
	
	public void price1() {
		WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait4.until(ExpectedConditions.visibilityOf(price)).click();
		
	}
	public void productclick() {
		product_link.click();
	}
	public void drop() throws InterruptedException {
		Select s1=new Select(drop_down);
		s1.selectByVisibleText("Newest Arrivals");
		Thread.sleep(2000);
		s1.selectByVisibleText("Price: High to Low");
		Thread.sleep(2000);
		s1.selectByVisibleText("Avg. Customer Review");
	}
	public void orderslink() {
		orders.click();	
	}
	
	//step3
	public Amz_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
