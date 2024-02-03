package loginBeforeCheckout;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import addProduct.AddProductsinCart;
import registerWhileCheckout.RegisterCheckout;
import validLogin.ValidLogin;

public class LoginBefore {
	WebDriver driver;
	public LoginBefore(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void loginBefore() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ValidLogin  vl=new ValidLogin (driver);
		vl.clickLogin();  vl.enterEmail("sp@gmail.com");
	    vl.enterpassword("982257");  vl.clickLoginbutton();

	    AddProductsinCart ac=new AddProductsinCart(driver);
		ac.clickproduct();    ac.clickAddtocart();          ac.clickContinueshopping();
		ac.clickcart();

		RegisterCheckout RC=new RegisterCheckout(driver);
		RC.clickProceedcheckout(); RC.enterMessage("I like the products");   RC. clickPlaceorder();
		RC.entername("KANCHAN YADAV");    RC. enterCard("34567");
		RC.enterCVC("411");   RC.enterMonts("10");   RC.enterYears("2026");
		RC.clickconfirm();    RC.clickdelete();    RC.clickContinue();
	}

}
