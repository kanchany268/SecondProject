package automationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationTestPage.Callings;




public class RegisterBeforeCheckout extends Callings {
	WebDriver driver;

	public RegisterBeforeCheckout (WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[5]/child::a") WebElement delete;
	@FindBy(xpath = "//a[@class='btn btn-primary']")WebElement continues;
	public void clickbeforetest() {
	RegisterUser ru=new RegisterUser(driver);
	ru.clickSignup();   ru.entername("kanchan");     ru.enteremailAddress("kanchan331@gamil.com");            ru.clicksignup();
	ru.clickmrs();      ru.enterPassword("9822456323");      ru.Days();    ru.Months();       ru.Years();    ru.clicknews();       ru.clickoptin();
	ru.enterFirstname("kanchan");  ru.enterLastname("yadav"); ru.enterCompany("Infosys");
	ru.enterAddress1("Mahakali kapil chowk chandrapur");      ru.enterAddress2("M.K.C");      ru.clickCountry();  ru.enterState("maharashtra");
	ru.enterCity("Chandrapur");    ru.enterCode("442401");    ru.enterMobileNo("8551879822"); ru.clickCreateAccount();

	AddProductsinCart ac=new AddProductsinCart(driver);
	ac.clickproduct();    ac.clickAddtocart();          ac.clickContinueshopping();
	ac.clickcart();

	RegisterWhileCheckout RC=new RegisterWhileCheckout(driver);
	RC.clickProceedcheckout();
	RC.enterMessage("I like the products");   RC. clickPlaceorder();
	RC.entername("KANCHAN YADAV");    RC. enterCard("34567");
	RC.enterCVC("411");   RC.enterMonts("10");   RC.enterYears("2026");
	RC.clickconfirm();     RC.clickdelete();    RC.clickContinue();
	}
	}


