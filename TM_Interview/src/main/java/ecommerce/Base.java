package ecommerce;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import io.appium.java_client.android.AndroidElement;

public class Base {
	public static AndroidDriver<AndroidElement> driver;
	
	@BeforeClass
    //public static void main (String[]args) throws MalformedURLException {
		public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{
		
	
		
		DesiredCapabilities cap = new DesiredCapabilities();
	
	     cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554"); //bc69c45c
	     cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
         //cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	     cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
	     cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
         driver = new AndroidDriver <AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
         
         //driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
      
}

	public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	
	} 
}

