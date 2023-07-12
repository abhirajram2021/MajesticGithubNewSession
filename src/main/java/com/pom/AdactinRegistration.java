package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinRegistration {
	public static  WebDriver driver;
	
	@FindBy(id="username")
	private static WebElement username;
	
	@FindBy(id="password")
	private static WebElement password;
	
	@FindBy(id="re_password")
	private static WebElement confirmpassword;
	
	@FindBy(id="full_name")
	private static WebElement fullname;
	
	@FindBy(id="email_add")
	private static WebElement emailaddress;
	
	@FindBy(id="captcha-form")
	private static WebElement ctext;
	
	@FindBy(xpath="//a[contains(text(),'Terms & Conditions')]")
	private static WebElement tcondition;
	
	@FindBy(id="tnc_box")
	private static WebElement tandc;
	
	@FindBy(id="Submit")
	private static WebElement register;
	
	
	public WebElement GetUsername()
	{
		return username;
	}
	
	public WebElement GetPassword()
	{
		return password;
	}
	
	public WebElement ConfirmPassword()
	{
		return confirmpassword;
	}
	public WebElement FullName()
	{
		return fullname;
	}
	public WebElement Emailaddress()
	{
		return emailaddress;
	}
	public WebElement CText()
	{
		return ctext;
	}
	public WebElement Tcondition()
	{
		return tcondition;
	}
	
	public WebElement Tandc()
	{
		return tandc;
	}
	public WebElement Register()
	{
		return register;
	}
	public AdactinRegistration(WebDriver driver2)
	{
	this.driver = driver2;
	PageFactory.initElements(driver,this);
	}
	}
