package calculator.appium;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class GetDriverInfo {
	
	private static ProjectProperties pp = new ProjectProperties();
	
	public static AppiumDriver<MobileElement> getDriver() throws MalformedURLException{
		
		AppiumDriver<MobileElement> driver;
		
		driver = new AppiumDriver<MobileElement>(getURL(), Android());
		
		return driver;
	}
	
	public static DesiredCapabilities Android() {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// Smartphone Infos
		
		cap.setCapability("deviceName", pp.readProperty("android.deviceName", "test"));
		cap.setCapability("udid", pp.readProperty("android.udid", "test"));
		//cap.setCapability("udid", pp.readProperty("android.udid.ip", "test"));
		cap.setCapability("platformName", pp.readProperty("android.platformName", "test"));
		cap.setCapability("platformVersion", pp.readProperty("android.platformVersion", "test"));
		
		// Application Infos
		
		cap.setCapability("appPackage", pp.readProperty("calculator.appPackage", "test"));
		cap.setCapability("appActivity", pp.readProperty("calculator.appActivity", "test"));
		
		return cap;
	}
	
	public static DesiredCapabilities IOS() {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// Smartphone Infos
		cap.setCapability("deviceName", "Samsung Galaxy S7"); // C:\Users\Kafein\AppData\Local\Android\Sdk\tools\bin
		cap.setCapability("udid", "ce011821d905c4400d");
		//cap.setCapability("udid", "192.168.1.3:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		
		// Application Infos
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		return cap;
		
	}
	
	public static URL getURL() throws MalformedURLException {
		URL url = new URL("http://127.0.0.1:4723/wd/hub");		
		
		return url;
	}

}
