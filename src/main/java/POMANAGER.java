import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.AdactinBookHotel;
import com.pom.AdactinBookedItinery;
import com.pom.AdactinHotelConfirm;
import com.pom.AdactinLogin;
import com.pom.AdactinRegistration;
import com.pom.AdactinSearchHotel;
import com.pom.AdactinSelectHotel;

public class POMANAGER {
	public static WebDriver driver;
	private AdactinLogin al;
	private AdactinRegistration ar;
	private AdactinSearchHotel ash;
	private AdactinSelectHotel aslh;
	private AdactinBookHotel abh;
	private AdactinHotelConfirm ahc;
	private AdactinBookedItinery abi;
	
	public AdactinLogin getLoginFunction()
	{ al=new AdactinLogin(driver);
	    return al;}
	
	public AdactinRegistration getUserRegistration()
	{ ar=new AdactinRegistration(driver);
	    return ar; }
	
	public AdactinSearchHotel getSearchHotel()
	{
		ash=new AdactinSearchHotel(driver);
		return ash;}
	
	public AdactinSelectHotel getSelectHotel()
	{
		aslh=new AdactinSelectHotel(driver);
		return aslh;
	}
	
	public 	AdactinBookHotel getBookHotel()
	{
		abh=new AdactinBookHotel(driver);
		return abh;
	}
	public AdactinHotelConfirm getHotelConfirm()
	{
		ahc=new AdactinHotelConfirm(driver);
		return ahc;
	}
	
	public AdactinBookedItinery getBookedItinery()
	{
		abi=new AdactinBookedItinery(driver);
		return abi;
	}
	
	 public POMANAGER(WebDriver driver2)
		{
		this.driver = driver2;
		PageFactory.initElements(driver,this);
		}
}
