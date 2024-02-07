package automationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class RegisterWhileCheckout extends Callings {
	

WebDriver driver;
		public RegisterWhileCheckout(WebDriver ldriver) {
			driver=ldriver;
			PageFactory.initElements(driver, this);
		}


		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[3]/child::a") WebElement cart ;
		@FindBy(xpath = "//div[@class='col-sm-6']/child::a")  WebElement Checkout;
	    @FindBy(xpath = "//p[@class='text-center']/child::a[1]/child::u") WebElement Register;
	    @FindBy(xpath = "//a[@class='btn btn-default check_out']")  WebElement proceedcheckout;
		@FindBy(xpath = "//div[@class='step-one']/child::h2") WebElement details;
		@FindBy(xpath = "//textarea[@name='message']") WebElement message;
		@FindBy(xpath = "//a[@class='btn btn-default check_out']") WebElement placeorder;
		@FindBy(name = "name_on_card") WebElement name;
		@FindBy(name="card_number") WebElement card;
		@FindBy(name = "cvc") WebElement cvc;
		@FindBy(name = "expiry_month") WebElement months;
		@FindBy(name = "expiry_year") WebElement years;
		@FindBy(xpath = "//button[@id='submit']") WebElement confirmorder;
		@FindBy(xpath="//div[@class='alert-success alert']") WebElement ordermessage;
		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[5]/child::a") WebElement deleted;
		@FindBy(xpath = "//a[@class='btn btn-primary']") WebElement continues;
		public void addproduct() {
			AddProductsinCart ac=new AddProductsinCart(driver);
			ac.clickproduct();  ac.clickAddtocart();  ac.clickContinueShopping();
			ac.clickAddtoCart(); ac.clickContinueshopping();  ac. clickcart() ;
		}



		public void cart() {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Assert.assertTrue(cart.isDisplayed());
		}
	public void clickCheckout() {
		Checkout.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickRegister() {
		Register.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	 public void singupss() {
		 RegisterUser ru=new RegisterUser(driver);
	 ru.clickSignup();    ru.entername("kanchan");ru.enteremailAddress("kanchan662@gamil.com");
	ru.clicksignup(); ru.clickmrs(); ru.enterPassword("9822456323");
	ru.Days();  ru.Months(); ru.Years(); ru.clicknews();  ru.clickoptin(); ru.enterFirstname("kanchan");
	ru.enterLastname("yadav"); ru.enterCompany("Infosys"); ru.enterAddress1("Mahakali kapil chowk chandrapur");
	ru.enterAddress2("M.K.C"); ru.clickCountry(); ru.enterState("maharashtra");
	ru.enterCity("Chandrapur");ru.enterCode("442401");ru.enterMobileNo("8551879822");
	ru.clickCreateAccount();  ru.clickContinue();
	 }
	 public void clickcarts() {
			cart.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	 public void clickProceedcheckout() {
		 proceedcheckout.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Assert.assertTrue(details.isDisplayed());
	 }
	 public void enterMessage(String msg) {
		 message.sendKeys(msg);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 public void clickPlaceorder() {
		 placeorder.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 public void entername(String Name) {
		 name.sendKeys(Name);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }

	 public void enterCard(String No) {
		 card.sendKeys(No);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 public void enterCVC(String cVc) {
		 cvc.sendKeys(cVc);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 public void enterMonts(String month) {
		 months.sendKeys(month);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 public void enterYears(String year) {
		 years.sendKeys(year);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 public void clickconfirm() {
		 confirmorder.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 String sucessmsg=ordermessage.getText();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 System.out.println(sucessmsg+"Your order has been placed successfully!");
		 
		
		
	 }
	 public void clickdelete() {
	    deleted.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    Assert.assertTrue(deleted.isDisplayed()) ;
		System.out.println("Delete account is visible");
	 }
	 public void clickContinue() {
		    continues.click();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 }
	 }











