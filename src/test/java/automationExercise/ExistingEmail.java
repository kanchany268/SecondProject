package automationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationTestPage.Callings;



public class ExistingEmail extends Callings{
WebDriver driver;
		public ExistingEmail(WebDriver Ldriver) {
			driver=Ldriver;
			PageFactory.initElements(driver, this);
		}


	    @FindBy(xpath = "//p[@style='color: red;']") WebElement Error;
		@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[1]/child::a") WebElement Home;


		public void clickemail() {
			RegisterUser ru=new RegisterUser(driver);
			ru.clickSignup();
			ru.entername("kanchan");
			ru.enteremailAddress("kanchan18@gamil.com");
			ru.clicksignup();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		    System.out.println(Error.getText());
			}

	public void clickHome() {
		Home.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	}


