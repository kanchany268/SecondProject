package automationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;




public class VerifyAddressDetails extends Callings {
WebDriver driver;
		public VerifyAddressDetails(WebDriver ldriver) {
			driver=ldriver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//ul[@class='address item box']") WebElement deliveryAdd;
		@FindBy(xpath = "//ul[@class='address alternate_item box']") WebElement billingyAdd;


	public void clickaddress() {
	    RegisterUser ru=new RegisterUser(driver);
	    ru.clickSignup();    ru.entername("kanchan");ru.enteremailAddress("kanchanl191@gamil.com");
		ru.clicksignup(); ru.clickmrs(); ru.enterPassword("9822456323");
		ru.Days();  ru.Months(); ru.Years(); ru.clicknews();  ru.clickoptin(); ru.enterFirstname("kanchan");
		ru.enterLastname("yadav"); ru.enterCompany("Infosys"); ru.enterAddress1("Mahakali kapil chowk chandrapur");
		ru.enterAddress2("M.K.C"); ru.clickCountry(); ru.enterState("maharashtra");
		ru.enterCity("Chandrapur");ru.enterCode("442401");ru.enterMobileNo("8551879822");
		ru.clickCreateAccount();  ru.clickContinue();


		AddProductsinCart ac=new AddProductsinCart(driver);
		ac.clickproduct();    ac.clickAddtocart(); ac.clickContinueshopping(); ac.clickcart();

		RegisterWhileCheckout RC=new  RegisterWhileCheckout(driver);
		 RC.clickCheckout();
		Assert.assertTrue(deliveryAdd.isDisplayed());
		Assert.assertTrue(billingyAdd.isDisplayed());
	        System.out.println(deliveryAdd.getText()+" "+billingyAdd.getText());
		
		
	} 
	    public void clickdelete() {
	    RegisterWhileCheckout RC=new  RegisterWhileCheckout(driver);
		 RC.clickdelete();    RC.clickContinue();

		 }
	
	
}
