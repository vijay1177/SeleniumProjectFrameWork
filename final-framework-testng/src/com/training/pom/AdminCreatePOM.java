package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminCreatePOM {
	private WebDriver driver; 
	
	public AdminCreatePOM(WebDriver driver) {
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
	
	@FindBy(xpath="//a[@href='course_category.php']")
	private WebElement coursesCategory;
	
	@FindBy(xpath="//img[@title='Add category']")
	private WebElement addCategory;
	
	@FindBy(id="course_category_code")
	private WebElement categoryCode; 
	
	@FindBy(id="course_category_name")
	private WebElement categoryName;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radioBtn;
	
	@FindBy(id="course_category_submit")
	private WebElement categorySubmitBtn;
	
	@FindBy(xpath="//a[@href='index.php?']")
	private WebElement adminLink;
	
	@FindBy(xpath="//a[@href='course_add.php']")
	private WebElement createCourse;
	
	@FindBy(id="update_course_title")
	private WebElement courseTitle;
	
	@FindBy(id="visual_code")
	private WebElement courseCode;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement catogerySelection;
	
	@FindBy(xpath="//span[text()='Test Learning (TL)']")
	private WebElement selectedCategory;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement searchTeacher;
	
	@FindBy(xpath="//li[text()='Vijay P (vijay7711)']") 
	private WebElement teacherName;
	
	@FindBy(xpath="//button[@class=' btn btn-primary ']")
	private WebElement courseSubmit;
	
	@FindBy(xpath="//li[@class='active']")
	private WebElement courseList;
	
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
	
	public void clickCourseCategory() {
		this.coursesCategory.click(); 
	}
	
	public void clickAddCategory() {
		this.addCategory.click(); 
	}
	
	public void sendCategoryCode(String categoryCode) {
		this.categoryCode.sendKeys(categoryCode); 
	}
	
	public void sendCategoryName(String categoryName) {
		this.categoryName.sendKeys(categoryName); 
	}
	
	public void selectRadioBtn() {
		this.radioBtn.isSelected(); 
	}
	
	public void clickCategorySubmitBtn() {
		this.categorySubmitBtn.click(); 
	}
	
	public void clickAdministrationLink() {
		this.adminLink.click(); 
	}
	
	public void clickCreateCourse() {
		this.createCourse.click(); 
	}
	
	public void sendCourseTitle(String courseTitle) {
		this.courseTitle.sendKeys(courseTitle); 
	}
	
	public void sendCourseCode(String courseCode) {
		this.courseCode.sendKeys(courseCode); 
	}
	
	//public void sendCategorySelection(String catogerySelection) {
		//this.catogerySelection.clear();
		//this.catogerySelection.sendKeys(catogerySelection); 
		//}
	
		public void sendCategorySelection() {
		this.catogerySelection.click(); 
		}
	
	public void displaySelectedCategory() {
		Actions act = new Actions(driver);
        act.moveToElement(selectedCategory).build().perform();
	}
	
	public void sendSearchTeacher(String searchTeacher) {
		this.searchTeacher.clear();
		this.searchTeacher.sendKeys(searchTeacher); 
		}
	
	public void displayTeacherName() {
		Actions act = new Actions(driver);
        act.moveToElement(teacherName).build().perform();
	}
	
	public void clickCourseSubmitted() {
		this.courseSubmit.click(); 
	}
	
	
	public boolean courseConfirm() {
		return this.courseList.isDisplayed();
	}
	
}
