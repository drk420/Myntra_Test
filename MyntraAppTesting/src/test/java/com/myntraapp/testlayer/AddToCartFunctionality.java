package com.myntraapp.testlayer;



import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myntraapp.paglayer.BuyPage;
import com.myntraapp.paglayer.HomePage;
import com.myntraapp.paglayer.JeansPage;
import com.myntraapp.testbase.TestBase;

public class AddToCartFunctionality extends TestBase{

	@Test
	public void veryfyaddtocartfunctionality() throws InterruptedException {
		
		String Expected_Result = "https://www.myntra.com/checkout/cart";
		
		HomePage homepage_obj = new HomePage(driver);
		homepage_obj.entersearchbartextbox("Jeans");
		homepage_obj.clickonsearchbaricon();
		
		
		JeansPage jeans_obj = new JeansPage(driver);
		jeans_obj.clickonradiobutton();
		Thread.sleep(5000);
		jeans_obj.clickonbundleslink();
		Thread.sleep(5000);
		jeans_obj.clickonbundlescheckbox();
		Thread.sleep(5000);
		jeans_obj.clickonflyingmachine();
		//jeans_obj.clickonroadstarimg();
		BuyPage buypage_obj = new BuyPage(driver);
		//buypage_obj.clickonsizechartbutton();
		buypage_obj.clickonsizebuttonn();
		buypage_obj.clickonaddtocartbutton();
		buypage_obj.clickonbaglink();
		
		buypage_obj.clickonremovelink();
		Thread.sleep(5000);
		buypage_obj.clickonremovepopuplink();
		Thread.sleep(5000);
		String Actual_Result = buypage_obj.getcurrenturlofpage();
		Assert.assertEquals(Actual_Result,Expected_Result);
		logger.info(Actual_Result);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
