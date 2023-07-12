package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdactinSearchHotel {
	
public static  WebDriver driver;
	
    @FindBy(name="location")
	private static WebElement Loc;
    
    public WebElement Location()
    { return Loc; }
	
    @FindBy(name="hotels")
	private static WebElement hotel;
    
    public WebElement Hotel()
    { return hotel; }
    
    @FindBy(name="room_type")
	private static WebElement room_type;
    
    public WebElement Room_Type()
    { return room_type; }
    
	@FindBy(name="room_nos")
	private static WebElement no_of_rooms;
	
	 public WebElement Room_number()
	    { return no_of_rooms; }
	
    @FindBy(name="datepick_in")
	private static WebElement check_in_date;
    
    public WebElement Check_In_Date()
    { return check_in_date; }

	@FindBy(name="datepick_out")
	private static WebElement check_out_date;
	
	public WebElement Check_Out_Date()
    { return check_out_date; }
	
    @FindBy(name="adult_room")	
	private static WebElement adroom;
    
    public WebElement Adultroom()
    { return adroom; }
	
    @FindBy(name="child_room")
	private static WebElement cldroom;
    
    public WebElement Childroom()
    { return cldroom; }
	
    @FindBy(name="Submit")
	private static WebElement search;
    
    public WebElement Submit()
    { return search; }
	
    public AdactinSearchHotel(WebDriver driver2)
	{
	this.driver = driver2;
	PageFactory.initElements(driver,this);
	}
    
	}
		

