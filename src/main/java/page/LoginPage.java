package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element List
	/*
	 * WebElement userNameElement =
	 * driver.findElement(By.xpath("//*[@id=\"username\"]")); By userNameField =
	 * By.xpath("//*[@id=\"username\"]");
	 */
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_ELEMENT;

	// Individual technique
	public void insertUserName(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);
	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickSignin() {
		SIGNIN_ELEMENT.click();
	}

	// combine technique
	public void performLogin(String userName, String password) {
		USERNAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_ELEMENT.click();

	}

}
