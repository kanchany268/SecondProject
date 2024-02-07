package automationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import automationTestPage.Callings;




public class LoginBeforeCheckout extends Callings{
	WebDriver driver;
		public LoginBeforeCheckout(WebDriver ldriver) {
			driver=ldriver;
			PageFactory.initElements(driver, this);
		}

		public void loginBefore() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ValidLogin  vl=new ValidLogin (driver);
			vl.clickLogin();  vl.enterEmail("shyla@gmail.com");
		    vl.enterpassword("shyla18");  vl.clickLoginbutton();

		    AddProductsinCart ac=new AddProductsinCart(driver);
			ac.clickproduct();    ac.clickAddtocart();          ac.clickContinueshopping();
			ac.clickcart();

			RegisterWhileCheckout RC=new RegisterWhileCheckout(driver);
			RC.clickProceedcheckout(); RC.enterMessage("I like the products");   RC. clickPlaceorder();
			RC.entername("KANCHAN YADAV");    RC. enterCard("34567");
			RC.enterCVC("411");   RC.enterMonts("10");   RC.enterYears("2026");
			RC.clickconfirm();    RC.clickdelete();    RC.clickContinue();
		}

	}



