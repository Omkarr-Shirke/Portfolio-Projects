package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import io.github.bonigarcia.wdm.WebDriverManager; 
import io.cucumber.java.Before; 
import io.cucumber.java.After; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then; 
import static org.junit.Assert.assertTrue; 


public class ExampleSteps {
	public static WebDriver driver;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		}
	@Given("I open the example page") 
	public void i_open_the_example_page() {
		driver.get("https://example.com");
		}
	@Then("the page title should contain {string}")
	public void the_page_title_should_contain(String expected) {
		String title = driver.getTitle(); assertTrue(title.contains(expected));
		}
	
	@After 
	public void tearDown() {
		if (driver != null) { 
			driver.quit(); 
			}
		}
	}
