package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginSnippet.LogInPage;

public class LogInPageTest2 {
	
	
	@Test()
	public void ValidCredentials() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\computer zone\\Documents\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");

		LogInPage loginPage = new LogInPage(driver);
		loginPage.login();
		
		
		//checking the Log Out button is present or not.
		WebElement Logout = driver.findElement(By.xpath("//input[@value='Log out']"));
		boolean displayed = Logout.isDisplayed();
		Assert.assertTrue(displayed);

		//checking the title of the Page.
		String title = driver.getTitle();
		Assert.assertEquals(title, "Insurance Broker System");

		//driver.manage().timeouts().implicitlyWait(5, TimeOut.SECOND);
		//Check the current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		//checking the Text is present in the page 
		driver.getPageSource().contains("Broker Insurance WebPage");

	}

}
