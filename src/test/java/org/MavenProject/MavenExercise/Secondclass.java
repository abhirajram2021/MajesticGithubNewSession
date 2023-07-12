package org.MavenProject.MavenExercise;


import com.pom.AdactinBookHotel;
import com.pom.AdactinBookedItinery;
import com.pom.AdactinHotelConfirm;
import com.pom.AdactinLogin;
import com.pom.AdactinRegistration;
import com.pom.AdactinSearchHotel;
import com.pom.AdactinSelectHotel;

public class Secondclass extends Firstclass {
	public static void main(String[] args) 
	{
		browser_Launch("chrome");
		Url("https://adactinhotelapp.com/");
		AdactinLogin al=new AdactinLogin(driver);
		UserName(al.getEmail(),"Abhirajram2021");
		Password(al.getPass(),"217OJP");
		Login(al.getLogin());
		
	
		Url1("https://adactinhotelapp.com/Register.php");
		AdactinRegistration ar=new AdactinRegistration(driver);
		GetUsername(ar.GetUsername(),"abcdefghijkljhgfd123");
		GetPassword(ar.GetPassword(),"20252025");
		ConfirmPassword(ar.ConfirmPassword(),"20252025");
		FullName(ar.FullName(),"Arathi Rajendran");
		Emailaddress(ar.Emailaddress(),"Arathi23@gmail.com");
		Ctext(ar.CText(),"de");
		Tcondition(ar.Tcondition());
		Tandc(ar.Tandc());
		Register(ar.Register());
		
		Url2("https://adactinhotelapp.com/SearchHotel.php");
		AdactinSearchHotel ash=new AdactinSearchHotel(driver);
		Location(ash.Location(),"Sydney");
		Hotel(ash.Hotel(),"Hotel Sunshine");
		RoomType(ash.Room_Type(),"Deluxe");
		RoomNo(ash.Room_number(),"4 - Four");
		Check_in_Date(ash.Check_In_Date(),"07/07/2023");
		Check_Out_Date(ash.Check_Out_Date(),"10/07/2023");
		Adultroom(ash.Adultroom(),"3 - Three");
		Childroom(ash.Childroom(),"2 - Two");
		Search(ash.Submit());
		
		AdactinSelectHotel aslh=new AdactinSelectHotel(driver);
		Radio(aslh.Radio());
		Continue(aslh.Continue());
		
		AdactinBookHotel abh=new AdactinBookHotel(driver);
		Fname(abh.Fname(),"Akash");
		Lname(abh.Lname(),"S");
		Email_Address(abh.Address(),"404 Apartment Kwest");
		CC_num(abh.CC_num(),"3216543322556623");
		CCtype(abh.CCtype(),"American Express"); 
		CC_exp_month(abh.CC_exp_month(),"February");
		Expyear(abh.Expyear(),"2026");
		CC_cvv(abh.CC_cvv(),"2222");
		Now(abh.Now());
		
		AdactinHotelConfirm ahc=new AdactinHotelConfirm(driver);
		Itinenaryb(ahc.Itinerary());	
		
		AdactinBookedItinery abi=new AdactinBookedItinery(driver);
		ITenarys(abi.ITenary());
		Cancelb(abi.Cancel());
		Logout(abi.Logout());
		
		}
    
	
}

	

