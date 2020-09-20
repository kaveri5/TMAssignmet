package TM_Interview.TM_Interview;

import org.testng.annotations.Test;



import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ecommerce.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.CheckoutPage;
import pageObjects.FormPage;



public class TestCase extends Base{


	
	@Test
	

	public void login () throws InterruptedException {
		System.out.println("Sucess");
		
		  FormPage formPage=new FormPage(driver);
		  formPage.nameField.sendKeys("Hello");
		
		   driver.hideKeyboard();
		   
		  formPage.femaleOption.click();
		  formPage.getcountrySelection().click();
		  
		   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
 
	     formPage.SelectCountry.click();
	     formPage.LetShop.click();
	

	    	}

	}

