package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookedItinery {
	
    public static  WebDriver driver;
	
    @FindBy(xpath="//input[@value='864956']")
	private static WebElement Itenary;
    
    public WebElement ITenary()
	{ return Itenary; }
    
    @FindBy(xpath="//input[@value='Cancel Selected']")
	private static WebElement cancel;
    
    public WebElement Cancel()
   	{ return cancel; }
    
    @FindBy(xpath="//input[@id='logout']")
	private static WebElement logout;
    
    public WebElement Logout()
	{ return logout; }
    
    public AdactinBookedItinery(WebDriver driver2)
	{
	this.driver = driver2;
	PageFactory.initElements(driver,this);
	}
     
   }
