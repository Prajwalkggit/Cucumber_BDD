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
//public class loginDemo 
//{
//	WebDriver driver;
//	
//	@Given("user entered project demo link")
//	public void user_entered_project_demo_link() 
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
//		   
//		   driver.get("https://example.testproject.io/web/");
//	}
//
//	@When("user enters valid username and password")
//	public void user_enters_valid_username_and_password() throws InterruptedException 
//	{
//		driver.get("https://example.testproject.io/web/");
//    	Thread.sleep(2000);
//    	driver.findElement(By.id("name")).sendKeys("Test");
//    	driver.findElement(By.id("password")).sendKeys("12345");
//    	Thread.sleep(2000);
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() 
//	{
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigated to project demo home screen")
//	public void user_is_navigated_to_project_demo_home_screen() 
//	{
//	    System.out.println("user is navigated to test project demo home screen");
//	    
//	   
//	    driver.close();
//	}
//	
//	
//}
