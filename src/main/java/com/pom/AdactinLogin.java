package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdactinLogin 
{
	public static  WebDriver driver;
	
	@FindBy(id="username")
	private static WebElement Eusername;
	
	@FindBy(id="password")
	private static WebElement Epassword;
	
	@FindBy(id="login")
	private static WebElement Login;
	
	public WebElement getEmail()
	{
		return Eusername;
	}
	
	public WebElement getPass()
	{
		return Epassword;
	}
	public WebElement getLogin()
	{
		return Login;
	}
	
	public AdactinLogin(WebDriver driver2)
	{
	this.driver = driver2;
	PageFactory.initElements(driver,this);
	}
}
