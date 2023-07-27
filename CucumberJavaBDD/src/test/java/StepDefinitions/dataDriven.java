//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class dataDriven 
//{
//	WebDriver driver;
//	@Given("browser is open")
//	public void browser_is_open() 
//	{
//		System.out.println("Inside step -- browser is open");
//		   
//		   String projectPath = System.getProperty("user.dir");
//		   System.out.println("project path is: "+ projectPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		
//		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		   
//		   driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException 
//	{
//		 driver.get("https://example.testproject.io/web/");
//		 Thread.sleep(2000);
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException 
//	{
//		driver.findElement(By.id("name")).sendKeys(username);
//    	driver.findElement(By.id("password")).sendKeys(password);
//    	Thread.sleep(2000);
//	}
//
//	@And("user click on login button")
//	public void user_click_on_login_button() throws InterruptedException 
//	{
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
//    	
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() 
//	{
//		 System.out.println("user is navigated to test project demo home screen");
//		   
//		 driver.close();
//	}	
//}
