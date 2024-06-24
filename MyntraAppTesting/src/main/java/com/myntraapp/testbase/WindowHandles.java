package com.myntraapp.testbase;

import java.util.ArrayList;
import java.util.Set;

public class WindowHandles extends TestBase {

	
	
	public  void windowhandling( int index) {
		
	Set<String> ids	= driver.getWindowHandles();
		
		ArrayList<String> allids = new ArrayList(ids);
		
	
	   driver.switchTo().window(allids.get(index));
		
		
		
		}}
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

