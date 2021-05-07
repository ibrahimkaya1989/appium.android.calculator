package appiumtests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
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
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// Smartphone Infos
		cap.setCapability("deviceName", "Samsung Galaxy S7");
		cap.setCapability("udid", "ce011821d905c4400d");
		//cap.setCapability("udid", "192.168.1.3:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application is started.");
		
		// Numbers
		MobileElement zero = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_00"));
		MobileElement one = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01"));
		MobileElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		MobileElement three = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03"));
		MobileElement four = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_04"));
		MobileElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
		MobileElement six = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_06"));
		MobileElement seven = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07"));
		MobileElement eight = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08"));
		MobileElement nine = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_09"));
		
		// 4 Ýþlem
		MobileElement mul = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_mul"));
		MobileElement div = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_div"));
		MobileElement sub = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_sub"));
		MobileElement add = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		MobileElement eql = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		
		
		MobileElement clear = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_clear"));
		
		five.click();
		mul.click();
		five.click();
		eql.click();
		
		MobileElement result = driver.findElement(By.className("android.widget.EditText"));
		
		System.out.println("Result is " + result.getText());
		System.out.println("Completed.");
		
	}

}
