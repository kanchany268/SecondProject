package registerPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import callingAutomationExercise.Callings;


public class RegisterUser extends Callings {
	WebDriver driver;
	public RegisterUser(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[4]/child::a")
	WebElement signup;
	@FindBy(xpath = "//div[@class='signup-form']/child::h2") WebElement singups;
	@FindBy(name = "name") WebElement Name;
	@FindBy(xpath = "//form[@action='/signup']/child::input[3]")WebElement Email;
	@FindBy(xpath = "//form[@action='/signup']/child::button")  WebElement Signup;
    @FindBy(xpath = "//h2[@class='title text-center']") WebElement Account;
	@FindBy(xpath = "//label[@for='id_gender2']/child::div/child::span/child::input") WebElement Tittle;
	@FindBy(name = "password") WebElement password;
	@FindBy(id="days")WebElement days;
	@FindBy(id="months") WebElement month;
	@FindBy(id = "years") WebElement years;
	@FindBy(id="newsletter") WebElement news;
	@FindBy(id="optin") WebElement optin;
    @FindBy(id="first_name") WebElement Firstname;
	@FindBy(id="last_name")  WebElement Lastname;
	@FindBy(id="company")   WebElement Company;
	@FindBy(id="address1") WebElement Address1;
	@FindBy(id="address2") WebElement Address2;
	@FindBy(name = "country") WebElement Country;
	@FindBy(id="state")  WebElement statename;
	@FindBy(name="city")WebElement City;
	@FindBy(id="zipcode") WebElement ZipCode;
	@FindBy(id="mobile_number") WebElement mobileno;
	@FindBy(xpath = "//h2[@class='title text-center']/following::button[1]")
	WebElement CreateAccount;
	@FindBy(xpath = "//div[@class='pull-right']/child::a") WebElement Continue;
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[10]") WebElement logged;
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/child::li[5]/child::a")  WebElement Delete;
	@FindBy(xpath = "//div[@class='pull-right']/child::a")  WebElement Continues;





public void clickSignup() {
	signup.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

}
public void entername(String name) {
	System.out.println(singups.getText());
	if(singups.isDisplayed()) {
		System.out.println("Test case pass");
	}else {
		System.out.println("Test case fail");
	}

    Name.sendKeys(name);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

}
public void enteremailAddress(String EMAIL) {
	Email.sendKeys(EMAIL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
 public void clicksignup() {
	Signup.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
 public void clickmrs() {
	 System.out.println(Account.getText());
	 if(Account.isDisplayed()) {
		 System.out.println("Enter Account Information is visible");
		 System.out.println("Test case Pass");
	 }else {
		 System.out.println("Test case Fail");
	 }
	 Tittle.click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
 public void enterPassword(String Pass) {
	 password.sendKeys(Pass);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
	public void Days() {
		Select dayDropDown=new Select(days);
		dayDropDown.selectByValue("18");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void Months() {
		Select monthDropDown=new Select(month);
		monthDropDown.selectByVisibleText("May");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void Years() {
		Select yearsDropDown=new Select(years);
		yearsDropDown.selectByValue("1997");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void clicknews() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",news);

}
public void clickoptin() {
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();",optin);

}

public void enterFirstname(String name) {
	Firstname.sendKeys(name);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}
public void enterLastname(String Lname) {
	Lastname.sendKeys(Lname);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}
public void enterCompany(String companyname) {
	Company.sendKeys(companyname);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}
public void enterAddress1(String address) {
	Address1.sendKeys(address);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}
public void enterAddress2(String address) {
	Address2.sendKeys(address);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}
public void clickCountry() {
	Select cou=new Select(Country);
	cou.selectByIndex(1);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
}
	public void enterState(String state) {
		statename.sendKeys(state);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	public void enterCity(String city) {
		City.sendKeys(city);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void enterCode(String zipcode) {
		ZipCode.sendKeys(zipcode);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void enterMobileNo(String no) {
		 mobileno.sendKeys(no);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void clickCreateAccount()	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",CreateAccount);
		 if( CreateAccount.isDisplayed()) {
			 System.out.println(" Click Create Account button is display");
		 }else {
			 System.out.println(" Click Create Account button not is display");
		 }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	public void clickContinue() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Continue);
		if(logged.isDisplayed()) {
			System.out.println(logged.getText()+":- Test case pass");
		}else {
			System.out.println(logged.getText()+":- Test case fail");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
public void clickDeleteAccount() {
	Delete.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	if(Delete.isDisplayed()) {
		System.out.println("Delete account is visible");
	}else {
		System.out.println("Delete account is not visible");
	}
}
public void clickContinues() {
	Continues.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}
}