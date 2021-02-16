package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne {
	
	WebDriver drv;
	
	public PageOne(WebDriver ddrv){
		
		drv=ddrv;
		
		PageFactory.initElements(ddrv, this);
	}
	
	@FindBy(id="txt_val_1")
	WebElement value1;
	
	@FindBy(id="txt_val_2")
	WebElement value2;
	
	@FindBy(id="txt_val_4")
	WebElement value4;
	
	@FindBy(id="txt_val_5")
	WebElement value5;
	
	@FindBy(id="txt_val_6")
	WebElement value6;
	
	@FindBy(id="txt_ttl_val")
	WebElement totalvalue;
	
	
	
	
	
	
	public void setValue1(String va1) {
		value1.sendKeys(va1);
	}

	public void setValue2(String va2) {
		value2.sendKeys(va2);
	}

	public void setValue4(String va4) {
		value4.sendKeys(va4);
	}

	public void setValue5(String va5) {
		value5.sendKeys(va5);
	}

	public void setValue6(String va6) {
		value6.sendKeys(va6);
	}

	public void setTotalvalue(String tva) {
		totalvalue.sendKeys(tva);
	}

	public void getValue1(String v1) {
		
		value1.getAttribute(v1);
	}
	
public void getValue2(String v2) {
		
		value1.getAttribute(v2);
	}

public void getValue4(String v4) {
	
	value1.getAttribute(v4);
}

public void getValue5(String v5) {
	
	value1.getAttribute(v5);
}

public void getValue6(String v6) {
	
	value1.getAttribute(v6);
}

public void getTotalvalue(String tv) {
	
	value1.getAttribute(tv);
}

}
