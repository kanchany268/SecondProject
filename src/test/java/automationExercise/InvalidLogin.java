package automationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationTestPage.Callings;



public class InvalidLogin extends Callings {
	
WebDriver driver;
		public InvalidLogin(WebDriver Ldriver)
		{
			driver=Ldriver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//form[@action='/login']/child::button") WebElement LoginButton;
		@FindBy(xpath = "//div[@class='login-form']/child::h2/following::p[1]")   WebElement Error;

		public void clicklogin() {
			ValidLogin  vl=new ValidLogin (driver);
			vl.clickLogin();  vl.enterEmail("Shital@yahoo.com");  vl.enterpassword("SHITAL123");
		}
		public void clickLoginbutton2() {
			 LoginButton.click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			System.out.println(Error.getText());
		}

	}

	

