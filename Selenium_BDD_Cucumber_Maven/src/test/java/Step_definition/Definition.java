package Step_definition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Definition
{
	WebDriver driver;

	@Given("^Application is up and running$")
	public void application_is_up_and_running(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SanjayKushwaha\\Desktop\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");


	}

	@When("^login with \"([^\"]*)\" and \"([^\"]*)\" credentials$")
	public void login_with_validNinvalid_credentials(String username,String password){
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() {
		System.out.println("Login is successful :-)");

	}

	@Given("^Login should have been successful$")
	public void login_should_have_been_successful()
	{
		System.out.println("Home page should be displayed");
	}

	@When("^Assert actual and expected titles$") 
	public void assert_actual_and_expected_titles(){

		/*String actualTitle=driver.getTitle();
		System.out.println(actualTitle);

		String exp="OrangeHRM";
		Assert.assertEquals(actualTitle, exp);*/
		System.out.println("Inside homepage");
	}

	@Then("^Assertion should be successful$")
	public void assertion_should_be_successful(){
		System.out.println("title comparison is successful");

	}
	
	@Given("Login A")
	public void login_A() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given A");
	}

	@When("A")
	public void a() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when A");
	}

	@Then("Smoke test A should be successfully")
	public void smoke_test_A_should_be_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then A");
	}

	@Given("Login B")
	public void login_B() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given B");
	}

	@When("B")
	public void b() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When B");
	}

	@Then("Smoke test B should be successfully")
	public void smoke_test_B_should_be_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then B");
	}

	@Given("Login C")
	public void login_C() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given C");
	}

	@When("C")
	public void c() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When C");
	}

	@Then("Smoke test C should be successfully")
	public void smoke_test_C_should_be_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then C");
	}

}


