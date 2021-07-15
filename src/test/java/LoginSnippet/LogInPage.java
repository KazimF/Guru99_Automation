package LoginSnippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	WebDriver driver;
	
	private By email = By.name("email");
	private By password = By.name("password");
	private By submit = By.name("submit");
	
	
	

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void login() {
		
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Jhon@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Wick@12");

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
	}
}
