package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")  //formLogin_submitAuth
	private WebElement loginBtn; 
	
	@FindBy(className="caret")
	private WebElement dropDown;
	
	@FindBy(id="logout_button")
	private WebElement logOut;
	
	@FindBy(linkText="Homepage")
	private WebElement homePage;
	
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
	
	public void clickCaretBtn() {
		this.dropDown.click();
	}
	
	public void clickLogoutBtn() {
		this.logOut.click();
	}
	
	public boolean getHomePage() {
		return this.homePage.isDisplayed();
	}
}
