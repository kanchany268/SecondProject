package automationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class SubscriptionInHomepage extends Callings{
;
WebDriver driver;


		public SubscriptionInHomepage(WebDriver Ldriver) {
			driver=Ldriver;
			PageFactory.initElements(driver, this);

	}

		@FindBy(id = "susbscribe_email") WebElement subscribeEmail;
	    @FindBy(xpath = "//button[@id='subscribe']/child::i") WebElement subscribeButton;
	    @FindBy(xpath = "//div[@id='success-subscribe']/child::div") WebElement errorMessage;


	public void enterSubcribeEmail(String email) {
		ExistingEmail ee=new ExistingEmail(driver);
	    ee.clickHome();
	    subscribeEmail.sendKeys(email);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	public void clickSubscribeButton() {
		subscribeButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String message=errorMessage.getText();
		Assert.assertEquals(message,"You have been successfully subscribed!");
		System.out.println(errorMessage.getText());
		}
		}


