package automationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;


public class AddReview extends Callings {
	WebDriver driver;
		public AddReview  (WebDriver Ldriver)
		{
			driver=Ldriver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//li[@class='active']/child::a") WebElement verifyreview;
		@FindBy(id="name")WebElement name;
		@FindBy(id="email")WebElement email;
		@FindBy(id="review")WebElement review;
		@FindBy(id="button-review") WebElement submit;
		@FindBy(xpath = "//div[@class='alert-success alert']/child::span") WebElement message;
		public void clickproduct() {
		ProductDetail p=new ProductDetail(driver);
	 	p.clickproduct();    p.clickviewproduct();

	}
		public void enterName( String Name) {
			
        Assert.assertTrue(verifyreview.isDisplayed());
        System.out.println(verifyreview.getText());
			
			name.sendKeys(Name);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		public void enterEmail( String Email) {
			email.sendKeys(Email);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		public void enterReview( String Review) {
			review.sendKeys(Review);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		public void clickSubmit() {
			submit.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String Message=message.getText();
			Assert.assertEquals(Message,"Thank you for your review.");
				System.out.println(Message);	
		}
	
}
