package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelConfirm {
	
	public static  WebDriver driver;
	
    @FindBy(id="my_itinerary")
	private static WebElement itinenary;
    
    public WebElement Itinerary()
    { return itinenary;}
    
    public AdactinHotelConfirm(WebDriver driver2)
	{
	this.driver = driver2;
	PageFactory.initElements(driver,this);
	}


}
