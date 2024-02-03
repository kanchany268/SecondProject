package testCasePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.Callings;

public class TestCase extends Callings {
	WebDriver driver;
	public TestCase(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[5]/child::a") WebElement TestCase;



public void clickTestcase() {
	TestCase.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	String ActualUrl=driver.getCurrentUrl();
	 String expectedUrl="https://automationexercise.com/test_cases";
	 if(expectedUrl.equalsIgnoreCase(ActualUrl))
		{
			System.out.println("Test case passs");
		}
		else
		{
			System.out.println("Test case fail");
		}

	 System.out.println( ActualUrl);
}
}





