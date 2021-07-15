package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginSnippet.HomePage;
import LoginSnippet.LogInPage;

public class HomePageTest {
	
	

	@Test()
	public void requestQuote1() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\computer zone\\Documents\\Selenium\\drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/insurance/v1/index.php");
	
	LogInPage loginPage = new LogInPage(driver);
	loginPage.login();

		
	
	//Cecking the Log Out Button is present
	WebElement Logout = driver.findElement(By.xpath("//input[@value='Log out']"));
	boolean displayed = Logout.isDisplayed();
	
	
	HomePage homePage = new HomePage(driver);
	homePage.calculatePremium();
	 
	//check Log out button is present 
	Assert.assertTrue(homePage.logOutButtonIsPresent());
	
	//Request Quote Tab is Present
	Assert.assertTrue(homePage.isRequestQuotationTabPresent());
	
	
	//Check radio button is seleceted.
	Assert.assertTrue(homePage.checkRadioButtonSelected());
	
		
	
	//Discount Display
	Assert.assertTrue(homePage.isCalculatedPremiumDisplayed());
	

	//check dropdown is selected 
	Assert.assertFalse(homePage.checkDropdownIsSelected());
	
	//chech Estimate value
	//Assert.assertTrue(homePage.valueEnteredInEstimateValue());
	
	
	

	
	
	//checking the Request a quotation is present 
//	WebElement requestQuotationPage = driver.findElement(By.xpath("//div[@id='tabs-2']/h2"));
//	boolean displayed = requestQuotationPage.isDisplayed();
	
	

	
	}
}
