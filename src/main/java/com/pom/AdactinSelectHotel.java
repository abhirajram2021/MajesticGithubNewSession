package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectHotel {

public static  WebDriver driver;
	
    @FindBy(name="radiobutton_0")
	private static WebElement radio;
	
	public WebElement Radio()
	{ return radio;}
	
    @FindBy(id="continue")
	private static WebElement bcontinue;
    
    public WebElement Continue()
	{ return bcontinue; }
    
    public AdactinSelectHotel(WebDriver driver2)
	{
	this.driver = driver2;
	PageFactory.initElements(driver,this);
	}
	
}
