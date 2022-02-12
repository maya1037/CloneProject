package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{

	WebDriver driver;

	// Element Liberary
	@FindBy(how = How.XPATH, using = "//h5[contains(text(), 'Add Contact')]")
	WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"application_ajaxrender\"]/a")
	WebElement SUMMARY_ON_PROFILE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"application_ajaxrender\"]/a")
	WebElement PROFILE_CUSTOMER_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]")
	WebElement ADD_CUSTOMER_LIST_CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"foo_filter\"]")
	WebElement SEARCH_BAR_LIST_CUSTOMER_ELEMENT;
	
	
	public void verifyAddContactPage() {
		waitForElement(driver, 10, ADD_CONTACT_HEADER_ELEMENT);
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), "Add Contact", "Wrong Page!!!");
	}
	
	public void insertFullName(String fullName) {
		int generatedNum = generateRandomNumber(9999);
		FULL_NAME_ELEMENT.sendKeys(fullName + generatedNum);
	}
	
	public void insertCompany(String company) {
		selectFromDropdown(COMPANY_NAME_ELEMENT, company);
		
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNumber(999) + email);
		
	}
}
