package com.training.sanity.tests;

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
import com.training.pom.LoginEditPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginEditProfile {

	private WebDriver driver;
	private String baseUrl;
	private LoginEditPOM loginEditPOM;
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
		loginEditPOM = new LoginEditPOM(driver); 
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
		loginEditPOM.sendUserName("vijay1177");
		loginEditPOM.sendPassword("vijaystudent");
		loginEditPOM.clickLoginBtn(); 
		loginEditPOM.clickEditProfile();
		loginEditPOM.sendPass("vijaystudent");
		loginEditPOM.sendNewPassword("studentvijay");
		loginEditPOM.sendConfirmPassword("studentvijay");
		loginEditPOM.clickSaveBtn();
		Boolean ActualResult = loginEditPOM.savedInfo();
		Assert.assertTrue(ActualResult);
		screenShot.captureScreenShot("First");
	}
}
