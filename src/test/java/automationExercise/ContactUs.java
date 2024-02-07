package automationExercise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automationTestPage.Callings;



public class ContactUs extends Callings{
	
WebDriver driver;
		public ContactUs(WebDriver Ldriver) {
			driver=Ldriver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//div[@class='shop-menu pull-right']/child::ul/child::li[8]/child::a") WebElement contact;
		@FindBy(xpath = "//div[@class='contact-form']/child::h2") WebElement title;
		@FindBy(name = "name") WebElement name;
		@FindBy(name="email") WebElement Email;
		@FindBy(name="subject") WebElement Subject;
		@FindBy(id="message") WebElement Message;
		@FindBy(xpath = "//input[@name='upload_file']")  WebElement uploadfile;
		@FindBy(name="submit") WebElement submit;
		@FindBy(xpath = "//div[@class='status alert alert-success']") WebElement successMsg;
		@FindBy(xpath = "//a[@class='btn btn-success']/child::span/child::i")  WebElement home;
	public void clickContactus() {
		contact.click();
		String Tittle=title.getText();
		Assert.assertEquals(Tittle,"GET IN TOUCH");
	    System.out.println(Tittle);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void enterName(String Name) {
		name.sendKeys(Name);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	public void enterEmail(String email) {
		Email.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	public void entersubject(String subj) {
		Subject.sendKeys(subj);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	public void enterMessage(String msg) {
		Message.sendKeys(msg);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickuplodFile(String file) {
		uploadfile.sendKeys(file);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickSubmit() {
		submit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		System.out.println(successMsg.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	public void clickHome() {
		home.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	}



