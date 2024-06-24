package com.myntraapp.paglayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myntraapp.testbase.TestBase;
import com.myntraapp.testbase.WindowHandles;

public class BuyPage extends TestBase {

	
	public  BuyPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	
	}

	@FindBy(xpath="//td[@class=\"sizeChartWeb-newCell \"]")
	private WebElement selectsize_radiobutton;
	
	@FindBy(xpath="//div[text()=\"ADD TO BAG\"]")
	private WebElement addtocart_button;
	
	@FindBy(xpath="//span[text()=\"Bag\"]")
	private WebElement Bag_link;
	@FindBy(xpath="//span[@class=\"size-buttons-size-chart\"]")
	private WebElement sizechat_button;
	@FindBy(xpath="(//span[text()=\"GO TO BAG\"])[2]")
	private WebElement gotobag_button;
	
	@FindBy(xpath="(//div[@class=\"size-buttons-tipAndBtnContainer\"])[1]")
	private WebElement size_button;
	
	@FindBy(xpath="//button[text()=\"REMOVE\"]")
	private WebElement Remove_link;
	@FindBy(xpath="(//button[text()=\"REMOVE\"])[2]")
	private WebElement Remove_linkpopup;
	public void clickonsizechartbutton() {
		
		sizechat_button.click();
	}
	public void clickonaddtocartbutton() {
		addtocart_button.click();
		
	}
	public void clickonbaglink() {
		Bag_link.click();
	}
	public String getcurrenturlofpage() {
		
		String url = driver.getCurrentUrl();
		return url;
	}
	public void clickonsizebutton() {
		sizechat_button.click();
	}
	public void clickongotobagbutton() {
		
		gotobag_button.click();
	}
	public void clickonsizeraiobutton() {
		selectsize_radiobutton.click();
	}
	
	public void clickonsizebuttonn() {
		WindowHandles i = new WindowHandles();
		i.windowhandling(1);
		size_button.click();
	}
	public void clickonremovepopuplink() {
		Remove_linkpopup.click();
	}
	public void clickonremovelink() {
		Remove_link.click();
	}
	
	
	
}
