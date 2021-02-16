package com.testcases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.PageOne;

public class TestCase_01 extends BaseClass{
	
	@Test
	public void verifyValuesCount() {
		drv.get(url);
				
		List<WebElement> lablevalues=drv.findElements(By.xpath("path of tag containing lables"));
		int lablecount=lablevalues.size();
		System.out.println(lablecount);
		
        List<WebElement> textvalues=drv.findElements(By.xpath("path of tag containing values"));
		int textcount=textvalues.size();
		System.out.println(textcount);
		
		if(lablecount==textcount){
			Assert.assertTrue(true);
    	}else{
			Assert.assertTrue(false);
		}
				
	}
	
	@Test
	public void verifyValuesGtZero() {
		drv.get(url);
		PageOne pageone=new PageOne(drv);
		
		List<WebElement> textvalues=drv.findElements(By.xpath("path of tag containing values"));
		int textcount=textvalues.size();
		System.out.println(textcount);
		
		for (int i = 0; i < textcount; i++) {
			
			String texvalue=textvalues.get(i).getAttribute("value");
			texvalue=texvalue.replace("/$","");
			if (Float.parseFloat(texvalue)>0) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
			
		}
		

	}
	
	@Test
	public void verifyValueHavingCurrency() {
		drv.get(url);
		PageOne pageone=new PageOne(drv);
		
		List<WebElement> textvalues=drv.findElements(By.xpath("path of tag containing values"));
		int textcount=textvalues.size();
		System.out.println(textcount);
		
		for (int i = 0; i < textcount; i++) {
			
			String texvalue=textvalues.get(i).getAttribute("value");
			
			if (texvalue.contains("/$")) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
			
		}
		

	}
	
	@Test
	public void checkTotal() {
		drv.get(url);
		PageOne pageone=new PageOne(drv);
		Float totalValue=1000000.00f;
		List<WebElement> textvalues=drv.findElements(By.xpath("path of tag containing values"));
		int textcount=textvalues.size();
		System.out.println(textcount);
		Float total=0.0f;
		for (int i = 0; i < textcount; i++) {
			
			String texvalue=textvalues.get(i).getAttribute("value");
			texvalue=texvalue.replace("/$","");
			total=total+Float.parseFloat(texvalue);
			
		}
		if (totalValue==total) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		

	}



}
