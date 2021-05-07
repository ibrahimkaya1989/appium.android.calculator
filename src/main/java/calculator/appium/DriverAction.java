package calculator.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;

public class DriverAction {
	
	private static ProjectProperties pp = new ProjectProperties();
	
	public void ClickByID(String element, AppiumDriver<MobileElement> driver) {
		
		MobileElement mobileElement = driver.findElement(By.id(pp.readProperty(element, "elements")));
		mobileElement.click();
		
		calculator.appium.Logger.Show(mobileElement.getText() + " butonuna týklanýr!");
	}
	
	public String GetTextByID(String element, AppiumDriver<MobileElement> driver) {
		
		MobileElement result = driver.findElement(By.className(element));
		
		return result.getText();
		
	}

}
