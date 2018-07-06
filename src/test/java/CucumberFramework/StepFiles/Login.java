package CucumberFramework.StepFiles;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//java//CucumberFramework//Resources//chromedriver.exe");
		driver = new ChromeDriver();


		/*System.setProperty("webdriver.geckodriver.driver",System.getProperty("user.dir") + "//src//test//java//CucumberFramework//Resources//geckodriver.exe");
		FirefoxOptions ffOptions=new FirefoxOptions();
		ffOptions.addPreference("marionette",true);		
		driver = new FirefoxDriver(ffOptions);*/


		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.quit();
		driver=null;
	}

	@Given("^User navigates to stackoverflow login page$")
	public void user_navigates_to_stackoverflow_login_page() throws Throwable {
		driver.get("https://stackoverflow.com");
	}

	@And("^User clicks on login option$")
	public void user_clicks_on_login_option() throws Throwable {
		driver.findElement(By.xpath("//a[.='Log In']")).click();
	}

	@And("^User enters username$")
	public void user_enters_username() throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishal6126@gmail.com");
	}

	@And("^user enters password$")
	public void user_enters_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Summer@69");
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[@id='submit-button']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	@Then("^User should be navbigated to successful login page$")
	public void user_should_be_navbigated_to_successful_login_page() throws Throwable {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[@title='Recent inbox messages']")).isDisplayed());
	}
}
