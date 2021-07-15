package LoginSnippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	private By requestPageTab = By.id("ui-id-2");
	private By estimateValue =  By.id("quotation_vehicle_attributes_value");
	private By calculatePremium = By.xpath("//input[@value='Calculate Premium']");
	private By calculatedPremium = By.id("calculatedpremium");
	private By logoutButtonPresent = By.xpath("//input[@value='Log out']");
	private By radioButtoncheckSelected = By.name("windscreenrepair");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void calculatePremium() {
		
		//click on requestQoute
		driver.findElement(requestPageTab).click();
		
		
		//check the radio button
		WebElement radioButton = driver.findElement(By.name("windscreenrepair"));
		radioButton.click();
		
		//enter Estimated value
		driver.findElement(estimateValue).sendKeys("1000");
		driver.findElement(By.id("quotation_vehicle_attributes_value")).getAttribute("value");

		
		//select from dropdown box - parking location
		Select dropdown = new Select(driver.findElement(By.name("parkinglocation")));
		dropdown.selectByVisibleText("Public Place");
				
		//click on Calculate Premium Button
		driver.findElement(calculatePremium).click();
	}
	
	

	
	
	
	public boolean isRequestQuotationTabPresent() {
		WebElement requestQuotationPage = driver.findElement(By.xpath("//div[@id='tabs-2']/h2"));
		return requestQuotationPage.isDisplayed();

	}
	
	public boolean logOutButtonIsPresent() {
		WebElement Logout = driver.findElement(logoutButtonPresent);
		return Logout.isDisplayed();
	}	
	
	public boolean checkRadioButtonSelected() {
		WebElement Radio1 = driver.findElement(radioButtoncheckSelected);
		return Radio1.isSelected();
	}
	
	public boolean checkDropdownIsSelected() {
		WebElement dropdownParking = driver.findElement(By.name("parkinglocation"));
		return dropdownParking.isSelected();
		
	}
	
//	public void checktitle() {
//		WebElement title = driver.findElement()
//		
//	}
//	
	
	
//	
//		public boolean valueEnteredInEstimateValue() {
//		WebElement value = driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1000");
//		return value.isDisplayed();
//		
//	}
	
	public boolean isCalculatedPremiumDisplayed() {
		WebElement calculatesPremium = driver.findElement(calculatedPremium);
		return calculatesPremium.isDisplayed();

	}

}
