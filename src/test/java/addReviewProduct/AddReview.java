package addReviewProduct;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import allProducts.ProductDetail;
import callingAutomationExercise.Callings;

public class AddReview extends Callings{
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
		if(verifyreview.isDisplayed()) {
			System.out.println(verifyreview.getText());
			System.out.println(" Test case pass");
		}else {
			System.out.println(" Test case fail");
		}
		name.sendKeys(Name);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void enterEmail( String Email) {
		email.sendKeys(Email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void enterReview( String Review) {
		review.sendKeys(Review);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickSubmit() {
		submit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(message.isDisplayed()) {
			System.out.println(message.getText());
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
	}
}