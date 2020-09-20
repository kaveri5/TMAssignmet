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
	     
	     CheckoutPage checkoutPage = new CheckoutPage(driver);
	     
	     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	 	
		 checkoutPage.ClickCart.click();
		    Thread.sleep(4000);
		    
			int count=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
			double sum=0;
			CheckoutPage checkOutPage=new CheckoutPage(driver);
			
			for(int i=0;i<count;i++)
			{
			String amount1=	checkOutPage.productList.get(i).getText();
			double amount=getAmount(amount1);
			sum=sum+amount;//280.97+116.97.
			}
	System.out.println(sum+"sum of products");

	String total=checkOutPage.totalAmount.getText();

	total= total.substring(1);
	double totalValue=Double.parseDouble(total);
	System.out.println(totalValue+"Total value of products");
	AssertJUnit.assertEquals(sum, totalValue);  
	
		}
	public static double getAmount(String value)
	{
		value= value.substring(1);
		double amount2value=Double.parseDouble(value);
		return amount2value;
		
		
	}

	}

