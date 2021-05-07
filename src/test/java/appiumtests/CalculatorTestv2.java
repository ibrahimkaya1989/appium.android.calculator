package appiumtests;

import calculator.appium.DriverAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTestv2 {

	static AppiumDriver<MobileElement> driver;
	static DriverAction driverAction = new DriverAction();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			openCalculater();
		}
		catch(Exception exp)
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	
	public static void openCalculater() throws Exception
	{
		driver = calculator.appium.GetDriverInfo.getDriver();
		
		calculator.appium.Logger.Show("Application is started.");
		
		driverAction.ClickByID("element.btn05", driver);
		
		driverAction.ClickByID("element.mul", driver);
		
		driverAction.ClickByID("element.btn05", driver);
		
		driverAction.ClickByID("element.eql", driver);
		
		calculator.appium.Logger.Show("Result is " + driverAction.GetTextByID("android.widget.EditText", driver));
		
		calculator.appium.Logger.Show("Completed.");
		
	}

}
