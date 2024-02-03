package validLogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.Callings;
import registerPage.RegisterUser;

public class ValidLogin extends Callings {
	WebDriver driver;
	public ValidLogin(WebDriver Ldriver)
	{
		driver=Ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[4]/child::a")
	WebElement Login;
	@FindBy(xpath = "//div[@class='login-form']/child::h2") WebElement login;
	@FindBy(name = "email") WebElement Email;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath = "//form[@action='/login']/child::button") WebElement LoginButton;
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[10]") WebElement logged;




 public void clickLogin() {
		Login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 System.out.println(login.getText());
			if(login.isDisplayed()) {
						System.out.println("Test case pass");
					}else {
						System.out.println("Test case fail");
					}

	}
 public void enterEmail(String email) {

	Email.sendKeys(email);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
 public void enterpassword(String pass) {
	 password.sendKeys(pass);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 }
 public void clickLoginbutton() {
	 LoginButton.click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 if(logged.isDisplayed()) {
			System.out.println(logged.getText()+":- Test case pass");
		}else {
			System.out.println(logged.getText()+":- Test case fail");
		}
 }
 public void checklog() {
	 RegisterUser ru=new RegisterUser(driver);
	 ru.clickDeleteAccount();   ru.clickContinues();

 }
}
