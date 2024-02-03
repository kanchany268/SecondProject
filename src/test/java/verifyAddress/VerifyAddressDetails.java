package verifyAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import addProduct.AddProductsinCart;
import callingAutomationExercise.Callings;
import registerPage.RegisterUser;
import registerWhileCheckout.RegisterCheckout;

public class VerifyAddressDetails extends Callings{
	WebDriver driver;
	public VerifyAddressDetails(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='address item box']") WebElement deliveryAdd;
	@FindBy(xpath = "//ul[@class='address alternate_item box']") WebElement billingyAdd;


	public void clickaddress() {
 RegisterUser ru=new RegisterUser(driver);
    ru.clickSignup();    ru.entername("kanchan");ru.enteremailAddress("kanchanl99@gamil.com");
	ru.clicksignup(); ru.clickmrs(); ru.enterPassword("9822456323");
	ru.Days();  ru.Months(); ru.Years(); ru.clicknews();  ru.clickoptin(); ru.enterFirstname("kanchan");
	ru.enterLastname("yadav"); ru.enterCompany("Infosys"); ru.enterAddress1("Mahakali kapil chowk chandrapur");
	ru.enterAddress2("M.K.C"); ru.clickCountry(); ru.enterState("maharashtra");
	ru.enterCity("Chandrapur");ru.enterCode("442401");ru.enterMobileNo("8551879822");
	ru.clickCreateAccount();  ru.clickContinue();


	AddProductsinCart ac=new AddProductsinCart(driver);
	ac.clickproduct();    ac.clickAddtocart(); ac.clickContinueshopping(); ac.clickcart();

	RegisterCheckout RC=new  RegisterCheckout(driver);
	 RC.clickCheckout();
	if(deliveryAdd.getText().equalsIgnoreCase(billingyAdd.getText())) {
		 System.out.println(" it same address Test case pass");
	 }else {
		 System.out.println(" it same address Test case pass");
	 }
	 RC.clickdelete();    RC.clickContinue();

	 }
}
