package verifyScrollUpUsingArrow;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.Callings;







public class UsingArrowButton extends Callings {
	WebDriver driver;
	public UsingArrowButton(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='single-widget']/child::h2")  WebElement visible;
	@FindBy(xpath = "//div[@class='item active']/child::div/child::h2")  WebElement fullmessage;
	@FindBy(xpath = "//i[@class='fa fa-angle-up']") WebElement arrow;

	public void scroll() {
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		if(visible.isDisplayed()) {
			System.out.println("'SUBSCRIPTION' is visible Test Case Pass");
		}else {
			System.out.println("'SUBSCRIPTION' is visible Test Case Fail");
		}}
		public void clickArrow() {

		arrow.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		if(fullmessage.isDisplayed()) {
			System.out.println(fullmessage.getText());
			System.out.println("Message is visible Test Case Pass");
		}else {
			System.out.println("Message is not  visible Test Case Fail");
		}}
	}


