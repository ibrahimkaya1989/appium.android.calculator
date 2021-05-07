package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTestNG {
	
	public class WORKTEST {
		
		AppiumDriver<MobileElement> driver;
		
		@BeforeTest
		void BeforeTest() throws MalformedURLException {
			
			System.out.println("BeforeTest");
			
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
		}
		
		@Test
		void Test1() {
			System.out.println("Test1");
		}
		
		@Test
		void Test2() {
			System.out.println("Test2");
		}
		
		@Test
		void Test3() {
			System.out.println("Test3");
		}
		
		@AfterTest
		void AfterTest() {
			System.out.println("AfterTest");
			
			driver.quit();
		}
	}
}
