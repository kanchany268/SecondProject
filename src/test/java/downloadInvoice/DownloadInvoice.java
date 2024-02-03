package downloadInvoice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import addProduct.AddProductsinCart;
import callingAutomationExercise.Callings;
import registerPage.RegisterUser;
import registerWhileCheckout.RegisterCheckout;

public class DownloadInvoice extends Callings {
	WebDriver driver;
	public  DownloadInvoice(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-default check_out']") WebElement dowload;
	@FindBy(xpath = "//h2[@class='title text-center']/following::p[1]") WebElement message;
	@FindBy(xpath = "//a[@class='btn btn-primary']")WebElement continuee;


	public void clickcarts() {


	AddProductsinCart ac=new AddProductsinCart(driver);
	ac.clickproduct();    ac.clickAddtocart(); ac.clickContinueshopping(); ac.clickcart();

	RegisterCheckout RC=new  RegisterCheckout(driver);
	 RC.clickCheckout();   RC.clickRegister();
	 RegisterUser ru=new RegisterUser(driver);

		ru.clickSignup();    ru.entername("kanchan");
		ru.enteremailAddress("kanchan5047@gamil.com");  ru.clicksignup();
		ru.clickmrs();       ru.enterPassword("9822456323");
		ru.Days();           ru.Months();             ru.Years();
		ru.clicknews();      ru.clickoptin();         ru.enterFirstname("kanchan");
		ru.enterLastname("yadav");                    ru.enterCompany("Infosys");
		ru.enterAddress1("Mahakali kapil chowk chandrapur");
		ru.enterAddress2("M.K.C"); ru.clickCountry(); ru.enterState("maharashtra");
		ru.enterCity("Chandrapur");ru.enterCode("442401");
		ru.enterMobileNo("8551879822");               ru.clickCreateAccount();
		ru.clickContinue();

	 RC.clickcarts();      RC.clickProceedcheckout();
	 RC.enterMessage("I like the products");            RC. clickPlaceorder();
	 RC.entername("KANCHAN YADAV");    RC. enterCard("34567");
	 RC.enterCVC("411");   RC.enterMonts("10");   RC.enterYears("2026");
	 RC.clickconfirm();

	}
public void clickDowlond() {
	dowload.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	if(message.isDisplayed()) {
		System.out.println(message.getText());
		System.out.println("Test case pass");
	}else {
		System.out.println("Test case fail");
	}

}
public void clickContinue() {
	continuee.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	RegisterCheckout RC=new  RegisterCheckout(driver);
	 RC.clickdelete();    RC.clickContinue();
}
}
