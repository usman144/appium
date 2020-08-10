package Eventbuizz;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class event_logout {
	
	static AppiumDriver<WebElement>driver;
	public static void main(String[] args) 
	{
		try {
			opencheckIn();
		} 
		catch (Exception ex)
		{
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		

	}
	
	
	
	public static void opencheckIn  () throws Exception
	{
		  DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability("deviceName", "Android Emulator");
				cap.setCapability("platformName", "Android");
				cap.setCapability("platformVersion", "11");
				cap.setCapability("udid", "emulator-5554");
				cap.setCapability("app", "C:\\Users\\sa\\Downloads\\checkin-live-EB-12005.apk");
			//	cap.setCapability("platformName", "Android");
			//	cap.setCapability("platformName", "Android");
			    cap.setCapability("autoGrantPermissions", "true"); 
			    cap.setCapability("autoAcceptAlerts", "true");
				
				URL url = new URL(" http://127.0.0.1:4723/wd/hub");
				driver = new AppiumDriver<WebElement>(url,cap);
				System.out.println("Application launched ...Yahoo!!");
				
				
				WebElement EveCode  = driver.findElement(By.id("com.eventbuizz.checkin:id/eteventCode"));
				WebElement email    = driver.findElement(By.id("com.eventbuizz.checkin:id/emailField"));
				WebElement password  = driver.findElement(By.id("com.eventbuizz.checkin:id/passwordField"));
				WebElement signin  = driver.findElement(By.id("com.eventbuizz.checkin:id/btnSave"));
				Thread.sleep(2000);
				WebElement logout = driver.findElement(By.className("android.widget.TextView"));
	
			//	WebElement logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
				
				EveCode.sendKeys("8167");
				email.sendKeys("mus@eventbuizz.com");
				password.sendKeys("123456");
				signin.click();
				System.out.println("SignUp USeCase passed");
				logout.click();
	            System.out.println("SignOut USeCase");
	            
	       
}
	          



}
