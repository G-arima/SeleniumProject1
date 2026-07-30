package SeleniumPackage1.Seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_HomePage {
	 WebDriver driver;
	//step1
	@FindBy(xpath="(//span[contains(@class,'nav-line-2 ')])[2]")
	WebElement Account_and_List;
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	WebElement Signin_button;
	
	@FindBy(xpath="//button[@data-testid='switch-accounts-button']")
	WebElement Manage_Profiles1;
	
	@FindBy(xpath="//div[contains(@class,'sc-hmdomO qqYTW')]/a[contains(@data-testid,'profile-view-button')]")
	WebElement view_link;
	
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement pencil;
	
	@FindBy(xpath="//input[@id='editProfileNameInputId']")
	WebElement input;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement btn1;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBar;
	
	@FindBy(linkText="Men's Casual Shoes")
	WebElement category;
	
	@FindBy(xpath="(//div[contains(@class,'a-checkbox')]/label/input)[7]")
	WebElement gender;
	
	@FindBy(xpath="(//input[@type='checkbox'])[7]")
	WebElement Brands;
	
	@FindBy(xpath="(//button[@value='7'])[1]")
	WebElement size_of_shoe;
	
	@FindBy(xpath="(//input[@type='checkbox'])[5]")
	WebElement delivery_day;
	
	@FindBy(xpath="//input[@aria-label='Minimum price']")
	WebElement price;
	
	@FindBy(xpath="(//span[text()='Men Lace Up Running Shoes'])[1]")
	WebElement product_link;
	
	@FindBy(xpath="//select[@id='s-result-sort-select']")
	WebElement drop_down;
	@FindBy(xpath="//h2[text()='Results']")
	WebElement results;
	@FindBy(xpath="//a[@id='nav-orders']")
	WebElement orders;
	@FindBy(xpath="//span[text()='All Discounts']")
	WebElement deals_discounts;
	//step2
	public void hvover(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(Account_and_List).perform();
		
	}
	
	public void signInButton()
	{
		Signin_button.click();
	}
	
	public void manage1() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Manage_Profiles1)).click();
	}
	
	public void view() throws NullPointerException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		Actions act = new Actions(driver);

		WebElement profile = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//*[contains(text(),'Garima')]")
		    )
		);

		act.moveToElement(profile).pause(Duration.ofSeconds(2)).perform();

		WebElement view_link = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//div[contains(@class,'sc-hmdomO qqYTW')]/a[contains(@data-testid,'profile-view-button')]")
		    )
		);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", view_link);

		Thread.sleep(1000);

		js.executeScript("arguments[0].click();", view_link);


	}
	
	public void penicon() {
		pencil.click();
	}
	
	public void input1() throws InterruptedException {
		input.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		input.sendKeys("Lekhi");
		
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
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='checkbox'])[1]"))).click();
		 //delivery_day.click();
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
	public void gender1() {
		WebDriverWait wait5=new WebDriverWait(driver,Duration.ofSeconds(20));
		 
		wait5.until(ExpectedConditions.visibilityOf(gender)).click();
	}
	public void deals() {
		WebDriverWait wait6=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait6.until(ExpectedConditions.visibilityOf(deals_discounts)).click();
	}
	//step3
	public Amz_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
