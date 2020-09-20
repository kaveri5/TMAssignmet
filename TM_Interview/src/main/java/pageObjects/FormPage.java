package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {
	public FormPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement nameField;
	
	
	@AndroidFindBy(xpath="//*[@text='Female']")
	public WebElement femaleOption;
	// driver.findElement(By.id("android:id/text1")).click();
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement countrySelection;
	
	
	public WebElement getcountrySelection()
	{
		System.out.println("Selecting the option from dropdown");
		return countrySelection;
	}
	
	@AndroidFindBy(xpath="//*[@text='Argentina']")
	public WebElement SelectCountry;
    //driver.findElement(By.xpath("//*[@text='Argentina']")).click();
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement LetShop;
	
	//driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	
}
