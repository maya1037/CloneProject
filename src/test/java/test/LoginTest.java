package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	// Login Data
	String userName = "demo@techfios.com";
	String Password = "abc123";

	@Test
	public void validUserShouldBeAbleToLogIn() {

		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(Password);
		loginPage.clickSignin();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.varifyDashbardHeader();
		
		BrowserFactory.tearDown();
	}

}
