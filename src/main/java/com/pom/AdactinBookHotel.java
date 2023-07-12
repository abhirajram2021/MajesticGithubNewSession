package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdactinBookHotel {
	
public static  WebDriver driver;
	
    @FindBy(name="first_name")
	private static WebElement f_name;
    
    public WebElement Fname()
    { return f_name;}
    
    @FindBy(name="last_name")
	private static WebElement L_name;
    
    public WebElement Lname()
    { return L_name;}
    
    @FindBy(name="address")
	private static WebElement add;
    
    public WebElement Address()
    { return add;}
    
    @FindBy(name="cc_num")
	private static WebElement ccnum;
    
    public WebElement CC_num()
    { return ccnum;}
    
    @FindBy(name="cc_type")
	private static WebElement cctype;
    
    public WebElement CCtype()
    { return cctype;}
    
    @FindBy(name="cc_exp_month")
	private static WebElement expmonth;
    
    public WebElement CC_exp_month()
    { return expmonth;}
	
    @FindBy(name="cc_exp_year")
   	private static WebElement expyear;
    
    public WebElement Expyear()
    { return expyear;}
    
    @FindBy(name="cc_cvv")
   	private static WebElement cvv;
    
    public WebElement CC_cvv()
    { return cvv;}
    
    
    @FindBy(name="book_now")
   	private static WebElement now;
    
    public WebElement Now()
    { return now;}
    
    public AdactinBookHotel(WebDriver driver2)
	{
	this.driver = driver2;
	PageFactory.initElements(driver,this);
	}
   	
}
