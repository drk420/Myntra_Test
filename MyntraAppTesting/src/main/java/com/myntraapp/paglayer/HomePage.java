package com.myntraapp.paglayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntraapp.testbase.TestBase;

public class HomePage extends TestBase {

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@placeholder=\"Search for products, brands and more\"]")
	private WebElement searchbar_textbox;
	
	
	@FindBy(xpath="//span[@class=\"myntraweb-sprite desktop-iconSearch sprites-search\"]")
	private WebElement searchbar_icon;
	
	
	public void entersearchbartextbox(String name) {
		searchbar_textbox.sendKeys(name);
		
	}
	
	public void clickonsearchbaricon() {
		searchbar_icon.click();
	
	}
	
	
	
	
}
