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
import com.training.pom.CreateUserPOM;
import com.training.pom.LoginAdminPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddUserCourse {

	private WebDriver driver;
	private String baseUrl;
	private CreateUserPOM createUserPOM;
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
		createUserPOM = new CreateUserPOM(driver); 
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
		createUserPOM.sendUserName("admin");
		createUserPOM.sendPassword("admin@123");
		createUserPOM.clickLoginBtn(); 
		createUserPOM.clickAdminBtn(); 
		createUserPOM.clickAddUser(); 
		createUserPOM.sendFirstName("VJ"); 
		createUserPOM.sendLastName("P"); 
		createUserPOM.sendEmail("vjtest@abc.com"); 
		createUserPOM.sendPhoneNumber("1231231234"); 
		createUserPOM.sendNewUserName("VK"); 
		createUserPOM.selectPwdRadioBtn();
		createUserPOM.sendNewPassword("test123");
		createUserPOM.clickProfile();
		createUserPOM.displayProfileName();
		createUserPOM.clickAddBtn();
		createUserPOM.clickAdministrationLink();
		createUserPOM.clickUserCourse();
		createUserPOM.clickHighlightUser();
		createUserPOM.clickHighlightCourse();
		createUserPOM.clickAddToCourse();
		Boolean ActualResult = createUserPOM.courseAddConfirm();
		Assert.assertTrue(ActualResult);
		screenShot.captureScreenShot("First");
	}
}
