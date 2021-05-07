package appiumtests;

import calculator.appium.DriverAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTest {

	static AppiumDriver<MobileElement> driver;
	static DriverAction driverAction = new DriverAction();
	
	@Given("user is on main page")
	public void user_is_on_main_page() throws Exception
	{
		driver = calculator.appium.GetDriverInfo.getDriver();
		calculator.appium.Logger.Show("Application is started.");	
	}
	
	@When("user taps on five button")
	public void user_taps_on_five_button()
	{
		driverAction.ClickByID("element.btn05", driver);
	}
	
	@And("user taps on multiple button")
	public void user_taps_on_multiple_button()
	{
		driverAction.ClickByID("element.mul", driver);
	}
	
	@And("user taps on five button again")
	public void user_taps_on_five_button_again()
	{
		driverAction.ClickByID("element.btn05", driver);
	}
	
	@And("user taps on equal button")
	public void user_taps_on_equal_button()
	{
		driverAction.ClickByID("element.eql", driver);
	}
	
	@Then("calculator shows the result on the screen")
	public void calculator_shows_the_result_on_the_screen()
	{
		calculator.appium.Logger.Show("Result is " + driverAction.GetTextByID("android.widget.EditText", driver));
		
		calculator.appium.Logger.Show("Completed.");
	}

}
