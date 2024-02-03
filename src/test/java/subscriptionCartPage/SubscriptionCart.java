package subscriptionCartPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.Callings;
import subscriptionHomePage.SubscriptionInHomepage;



public class SubscriptionCart extends Callings {
	WebDriver driver;


	public SubscriptionCart(WebDriver Ldriver) {
		driver=Ldriver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[3]/child::a")
	WebElement cart;


    @FindBy(xpath = "//div[@class='col-md-9 form-group hide']") WebElement errormsg;

public void clickCart() {
    	cart.click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

public void clicksub() {
		SubscriptionInHomepage sh=new SubscriptionInHomepage(driver);
		sh.enterSubcribeEmail("kanchan18@gmail.com");
		sh.clickSubscribeButton();
		System.out.println(errormsg.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}



}
