package com.training.sanity.tests;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminCreatePOM;
import com.training.pom.LoginAdminPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateCourseCategory {

	private WebDriver driver;
	private String baseUrl;
	private AdminCreatePOM adminCreatePOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		adminCreatePOM = new AdminCreatePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		adminCreatePOM.sendUserName("admin");
		adminCreatePOM.sendPassword("admin@123");
		adminCreatePOM.clickLoginBtn(); 
		adminCreatePOM.clickAdminBtn(); 
		adminCreatePOM.clickCourseCategory(); 
		adminCreatePOM.clickAddCategory(); 
		adminCreatePOM.sendCategoryCode("ULS"); 
		adminCreatePOM.sendCategoryName("Upskill Learnings"); 
		adminCreatePOM.selectRadioBtn(); 
		adminCreatePOM.clickAdministrationLink(); 
		adminCreatePOM.clickCreateCourse();
		adminCreatePOM.sendCourseTitle("Upskills");
		adminCreatePOM.sendCourseCode("USS");
		adminCreatePOM.sendCategorySelection();
		adminCreatePOM.displaySelectedCategory();
		adminCreatePOM.sendSearchTeacher("vijay");
		adminCreatePOM.displayTeacherName();
		adminCreatePOM.clickCourseSubmitted();
		Boolean ActualResult = adminCreatePOM.courseConfirm();
		Assert.assertTrue(ActualResult);
		screenShot.captureScreenShot("First");
	}
}
