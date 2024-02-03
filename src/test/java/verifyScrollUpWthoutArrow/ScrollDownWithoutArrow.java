package verifyScrollUpWthoutArrow;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.Callings;

public class ScrollDownWithoutArrow extends Callings {
	WebDriver driver;
	public ScrollDownWithoutArrow(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='single-widget']/child::h2")  WebElement visible;
	@FindBy(xpath = "//div[@class='item active']/child::div/child::h2")  WebElement fullmessage;


public void subscription() {
	JavascriptExecutor JS=(JavascriptExecutor)driver;
	JS.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	if(visible.isDisplayed()) {
		System.out.println("'SUBSCRIPTION' is visible Test Case Pass");
	}else {
		System.out.println("'SUBSCRIPTION' is visible Test Case Fail");
	}
	JavascriptExecutor JS1=(JavascriptExecutor)driver;
	JS1.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	if(fullmessage.isDisplayed()) {
		System.out.println(fullmessage.getText());
		System.out.println("Message is visible Test Case Pass");
	}else {
		System.out.println("Message is not  visible Test Case Fail");
	}
}
}
