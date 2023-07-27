package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class Testlogin_POM 
{
	WebDriver driver;
	
	loginPage login;
	
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.out.println("--- i am inside login pom file---- ");
		
//		   String projectPath = System.getProperty("user.dir");
//		   System.out.println("project path is: "+ projectPath);
		   
		   System.setProperty("webdriver.chrome.driver", "C:/Users/prajwal.kg/eclipse-workspace/CucumberJavaBDD/src/test/resources/drivers/chromedriver.exe");
		   
		   driver = new ChromeDriver();
		
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	   
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException 
	{
		
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(2000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException 
	{
	    login = new loginPage(driver);
		
		login.enterUsername(username);
		Thread.sleep(1000);
		login.enterPassword(password);
		Thread.sleep(1000);
		
//		driver.findElement(By.id("name")).sendKeys(username);
//     	driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
		
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException 
	{
	    driver.findElement(By.id("login")).click();
	    Thread.sleep(2000);
	}

	@Then("user is navigated to the home page of test project demo")
	public void user_is_navigated_to_the_home_page_of_test_project_demo() 
	{
	   System.out.println("logout button is present");
	   login.checklogout();
	   
	   driver.quit();
	}
}
