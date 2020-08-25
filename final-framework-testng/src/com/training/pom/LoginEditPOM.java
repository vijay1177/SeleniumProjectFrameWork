package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEditPOM {
	private WebDriver driver; 
	
	public LoginEditPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")  //formLogin_submitAuth
	private WebElement loginBtn; 
	
	@FindBy(linkText="Edit profile")  
	private WebElement EditProfile; 
	
	@FindBy(id="profile_password0")
	private WebElement pass;
		
	@FindBy(id="password1")
	private WebElement newpassword;
	
	@FindBy(id="profile_password2")
	private WebElement confirmpassword;
	
	@FindBy(id="profile_apply_change")  
	private WebElement saveBtn; 
	
	//@FindBy(className="alert alert-info")
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement savedInfo; 
	
	
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
	
	public void clickEditProfile() {
		this.EditProfile.click(); 
	}
	
	public void sendPass(String pass) {
	this.pass.sendKeys(pass);
	}
	
	public void sendNewPassword(String newpassword) {
	this.newpassword.sendKeys(newpassword);
	}
	
	public void sendConfirmPassword(String confirmpassword) {
		this.confirmpassword.sendKeys(confirmpassword);
		}
	
	public void clickSaveBtn() {
		this.saveBtn.click();
	}
	
	public boolean savedInfo() {
		return this.savedInfo.isDisplayed();
	}
	
}
