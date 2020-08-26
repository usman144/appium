package Eventbuizz;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class loginTest{
@Test
public void EveTest() throws MalformedURLException, Exception {
	 AppiumDriver<WebElement>driver;
	
	Thread.sleep(2000);
	DesiredCapabilities cap = new DesiredCapabilities();
	Thread.sleep(2000);
	cap.setCapability("deviceName", "Android Emulator");
	Thread.sleep(2000);
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "11");
	cap.setCapability("udid", "emulator-5554");
	cap.setCapability("app", "C:\\Users\\sa\\Downloads\\checkin-live-EB-12005.apk");
//	cap.setCapability("platformName", "Android");
//	cap.setCapability("platformName", "Android");
    cap.setCapability("autoGrantPermissions", "true"); 
    cap.setCapability("autoAcceptAlerts", "true");
	
	URL url = new URL(" http://127.0.0.1:4723/wd/hub");
	Thread.sleep(2000);
	driver = new AppiumDriver<WebElement>(url,cap);
	System.out.println("Application launched ...Yahoo!!");
	
	
	WebElement EveCode  = driver.findElement(By.id("com.eventbuizz.checkin:id/eteventCode"));
	Thread.sleep(2000);
	WebElement email    = driver.findElement(By.id("com.eventbuizz.checkin:id/emailField"));
	Thread.sleep(2000);
	WebElement password  = driver.findElement(By.id("com.eventbuizz.checkin:id/passwordField"));
	Thread.sleep(2000);
	WebElement signin  = driver.findElement(By.id("com.eventbuizz.checkin:id/btnSave"));

	
	
	
	EveCode.sendKeys("8167");
	email.sendKeys("mus@eventbuizz.com");
	password.sendKeys("123456");
	signin.click();
	

}
}
