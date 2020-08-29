package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPOM {
	private WebDriver driver; 
	
	public CreateUserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")  
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement adminBtn;
	
	@FindBy(xpath="//a[@href='user_add.php']")
	private WebElement addUser;
	
	@FindBy(id="firstname")
	private WebElement firstName;
	
	@FindBy(id="lastname")
	private WebElement lastName; 
	
	@FindBy(id="email")
	private WebElement enterEmail;
	
	@FindBy(id="phone")
	private WebElement enterPhone;
	
	@FindBy(id="username")
	private WebElement enterUsername;
	
	@FindBy(xpath="//input[@name='password[password_auto]']")
	private WebElement passwordRadioBtn;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement selectProfile;
	
	@FindBy(xpath="//span[text()='Learner']")
	private WebElement displayProfile;
	
	@FindBy(xpath="//button[@class=' btn btn-primary ']")
	private WebElement addBtn;
	
	@FindBy(xpath="//a[@href='index.php?']")
	private WebElement adminLink;
	
	@FindBy(xpath="//a[@href='subscribe_user2course.php']") 
	private WebElement userCourseLnk;
	
	@FindBy(xpath="//option[@value='1615']")
	private WebElement highlightUser;
	
	@FindBy(xpath="//option[@value='AB']")
	private WebElement highlightCourse;
	
	@FindBy(xpath="//button[@value='Add to the course(s) >>']")
	private WebElement addToCourse;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement confirmMsg;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickAdminBtn() {
		this.adminBtn.click(); 
	}
	
	public void clickAddUser() {
		this.addUser.click(); 
	}
	
	public void sendFirstName(String firstName) {
		this.firstName.sendKeys(firstName); 
	}
	
	public void sendLastName(String lastName) {
		this.lastName.sendKeys(lastName); 
	}
	
	public void sendEmail(String enterEmail) {
		this.enterEmail.sendKeys(enterEmail); 
	}
	
	public void sendPhoneNumber(String enterPhone) {
		this.enterPhone.sendKeys(enterPhone); 
	}
	
	public void sendNewUserName(String enterUsername) {
		this.enterUsername.sendKeys(enterUsername); 
	}
	
	public void selectPwdRadioBtn() {
		this.passwordRadioBtn.isSelected(); 
	}
	
	public void sendNewPassword(String enterPassword) {
		this.enterPassword.sendKeys(enterPassword); 
	}
		
	public void clickProfile() {
		this.selectProfile.click(); 
	}
	
	public void displayProfileName() {
		Actions act = new Actions(driver);
        act.moveToElement(displayProfile).build().perform();
	}
	
	public void clickAddBtn() {
		this.addBtn.click(); 
	}
		
	public void clickAdministrationLink() {
		this.adminLink.click(); 
	}
	
	public void clickUserCourse() {
		this.userCourseLnk.click(); 
	}
	
	public void clickHighlightUser() {
		this.highlightUser.click(); 
	}
	
	public void clickHighlightCourse() {
		this.highlightCourse.click(); 
	}
	
	public void clickAddToCourse() {
		this.addToCourse.click(); 
	}
	
	public boolean courseAddConfirm() {
		return this.confirmMsg.isDisplayed();
	}
	
}
