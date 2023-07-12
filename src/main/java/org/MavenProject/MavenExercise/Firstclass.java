package org.MavenProject.MavenExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstclass {
	public static WebDriver driver;

	public static void browser_Launch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

	}
	
	public static void Url(String url) {
		driver.get(url);
	}
	
	public static void UserName(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Username is entered");
	}

	public static void Password(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Password is entered");
	}

	public static void Login(WebElement element) {
		element.click();
	}
	
	public static void Url1(String url) {
		driver.navigate().to(url);
	}
	
	public static void GetUsername(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Username is entered");
	}

	public static void GetPassword(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Password is entered");
	}

	public static void ConfirmPassword(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Confirm is entered");
	}

	public static void FullName(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Fullname is entered");
	}

	public static void Emailaddress(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Email Address is entered");
	}

	public static void Ctext(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Captcha text is entered");
	}

	public static void Tcondition(WebElement element) {
		element.click();
	}

	public static void Tandc(WebElement element) {
		element.click();
	}

	public static void Register(WebElement element) {
		element.click();
	}
	
	public static void Url2(String url) {
		driver.navigate().to(url);
	}
	public static void Location(WebElement element,String text)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(text);
	}
	public static void Hotel(WebElement element,String text)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(text);
	}

	public static void RoomType(WebElement element,String text)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(text);
	}

	public static void RoomNo(WebElement element,String text)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(text);
	}
	
	public static void Check_in_Date(WebElement element,String string)
	{
		element.sendKeys(string);
	}
	public static void Check_Out_Date(WebElement element,String string)
	{
		element.sendKeys(string);
	}
	public static void Adultroom(WebElement element,String value)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(value);
	}
	public static void Childroom(WebElement element,String value)
	{
		Select sc=new Select(element);
		sc.selectByVisibleText(value);
	}
	public static void Search(WebElement element) {
		element.click();
	}
	
	public static void Radio(WebElement element) {
		element.click();
	}

	public static void Continue(WebElement element) {
		element.click();
	}

	public static void Fname(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Fullname is entered");
	}
	
	public static void Lname(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("Fullname is entered");
	}
	public static void Email_Address(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	
	public static void CC_num(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void CCtype(WebElement element, String value) {
		Select sc=new Select(element);
		sc.selectByVisibleText(value);
		
	}
	public static void CC_exp_month(WebElement element, String value) {
		Select sc=new Select(element);
		sc.selectByVisibleText(value);
		
	}
	public static void Expyear(WebElement element, String i) {
		Select sc=new Select(element);
		sc.selectByVisibleText(i);
	
	}
	public static void CC_cvv(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	public static void Now(WebElement element) {
		element.click();
		
	}
	
	public static void Itinenaryb(WebElement element) {
		element.click();
		
	}
	
	public static void ITenarys(WebElement element) {
		element.click();
		
	}
	public static void Cancelb(WebElement element) {
		element.click();
		
	}
	public static void Logout(WebElement element) {
		element.click();
		
	}
	

}
