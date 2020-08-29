package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseCatalogPOM {
	private WebDriver driver; 
	
	public CourseCatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")  //formLogin_submitAuth
	private WebElement loginBtn; 
	
	@FindBy(linkText="Course catalog")
	private WebElement courseCatalog;
	
	@FindBy(name="search_term")
	private WebElement searchTerm;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchBtn;
	
	//@FindBy(className="VJ123")
	@FindBy(xpath="//a[@title='VJ123']")
	private WebElement projectName;
	
	@FindBy(xpath="//a[@class='btn btn-lg btn-success btn-block']")
	private WebElement courseHome;
	
	@FindBy(id="istooldesc_24432")
	private WebElement projectLnk;
	
	@FindBy(className="title")
	private WebElement cmntspage;
	
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
	
	public void clickCourseCatalog() {
		this.courseCatalog.click();
	}
	
	public void sendSearchterm(String searchTerm) {
		this.searchTerm.sendKeys(searchTerm);
	}
	
	public void clickSearchButton() {
		this.searchBtn.click();
	}
	
	public void clickProjectName() {
		this.projectName.click();
	}
	
	public void clickCourseHome() {
		this.courseHome.click();
	}
	
	public void clickProjectLink() {
		this.projectLnk.click();
	}
	
	
	public boolean commentsPage() {
	return this.cmntspage.isDisplayed();
	}
}
