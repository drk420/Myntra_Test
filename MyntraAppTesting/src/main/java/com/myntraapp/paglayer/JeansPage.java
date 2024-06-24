package com.myntraapp.paglayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.myntraapp.testbase.TestBase;
import com.myntraapp.testbase.WindowHandles;

public class JeansPage extends TestBase {

	
	public  JeansPage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	@FindBy(xpath="(//label[@class='common-customRadio gender-label'])[1]")
	private WebElement men_radiobutton;
	

	@FindBy(xpath="//h4[@class=\"atsa-title\"][1]")
	private WebElement bundles_link;
	@FindBy(xpath="(//label[@class=\"common-customCheckbox\"])[8]")
	private WebElement bundles_checkbox;
	@FindBy(xpath="//img[@class=\"img-responsive\"]")
	private WebElement flyingmachine_img;
	public void clickonradiobutton() {
	String id2	= driver.getWindowHandle();
	logger.info(id2);
		waite(men_radiobutton);
		men_radiobutton.click();
	}
	

	
	public void clickonbundlescheckbox() {
		bundles_checkbox.click();
		
	}
	public void clickonbundleslink() {
		bundles_link.click();
	}
	
	public void clickonflyingmachine() {
		
		flyingmachine_img.click();
	}
	private WebElement waite(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	
	
	
}
