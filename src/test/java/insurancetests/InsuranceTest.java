package insurancetests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsuranceTest {

	@Test(enabled=false)
	public void ValidCredentials() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\computer zone\\Documents\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Jhon@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Wick@12");

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

		// checking the Log Out button is present or not.
		WebElement Logout = driver.findElement(By.xpath("//input[@value='Log out']"));
		boolean displayed = Logout.isDisplayed();
		Assert.assertTrue(displayed);

		// checking the title of the Page.
		String title = driver.getTitle();
		Assert.assertEquals(title, "Insurance Broker System");

		// driver.manage().timeouts().implicitlyWait(5, TimeOut.SECOND);
		// Check the current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

//		checking the Text is present in the page 
		driver.getPageSource().contains("Broker Insurance WebPage");

	}

	@Test(enabled=false)
	public void InvalidCredential() {

//			WebDriver driver = new ChromeDriver();
//			driver.get("http://demo.guru99.com/insurance/v1/index.php");
//			
//			WebElement email = driver.findElement(By.name("email"));
//			email.sendKeys("abc@gmail.com");
//			
//			WebElement password = driver.findElement(By.name("password"));
//			password.sendKeys("ab@12");
//			
//			WebElement submit = driver.findElement(By.name("submit"));
//			submit.click();
//			
//			//checking the Log Out button is present or not.
//			WebElement LogIn = driver.findElement(By.xpath("//input[@name='submit']"));
//			boolean displayed = LogIn.isDisplayed();			
//			Assert.assertTrue(displayed);
//			
//			String title = driver .getTitle();
//			Assert.assertEquals(title, "Insurance Broker System");
//			
//			//checking the Text is present in the page 
//			driver.getPageSource().contains("Enter your Email address and password correct");
//			

	}

	@Test()
	public void requestQuote() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\computer zone\\Documents\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Jhon@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Wick@12");

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		//Checking the Log Out Button is present
		WebElement Logout = driver.findElement(By.xpath("//input[@value='Log out']"));
		boolean displayed = Logout.isDisplayed();
		Assert.assertTrue(displayed);
		
		//click on requestQoute
		driver.findElement(By.id("ui-id-2")).click();
		
		//check the radio button
		WebElement radio1 = driver.findElement(By.name("windscreenrepair"));
        radio1.click();
		
		//enter Estimated value
		driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1000");
		
		//select from dropdown box - parking location
		Select dropdown = new Select(driver.findElement(By.name("parkinglocation")));
		dropdown.selectByVisibleText("Public Place");
				
		//click on Calculate Premium
		driver.findElement(By.xpath("//input[@value='Calculate Premium']")).click();
		
		//Discount Display
		WebElement calculatedPremium = driver.findElement(By.id("calculatedpremium"));
		Assert.assertTrue(calculatedPremium.isDisplayed());
		
		

	}
	
	
	@Test(enabled=false)
	public void LogoutTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\computer zone\\Documents\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Jhon@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Wick@12");

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		//Log Out button is present
		WebElement Logout = driver.findElement(By.xpath("//input[@value='Log out']"));
		boolean displayed = Logout.isDisplayed();
		Assert.assertTrue(displayed);
		
		//Successful Log In button is present
		WebElement LogIn = driver.findElement(By.xpath("//input[@name='submit']"));
		boolean display = LogIn.isDisplayed();
		Assert.assertTrue(displayed);
		

		
		
		
		
	}
	

}
