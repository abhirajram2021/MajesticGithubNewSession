
public class Adactin extends BaseClass{
	public static void main(String[] args) {
		browser_Launch("chrome");
		Url("https://adactinhotelapp.com/");
		
		POMANAGER pmg=new POMANAGER(driver);
		//Login Page
		pmg.getLoginFunction().getEmail();
		pmg.getLoginFunction().getPass();
		pmg.getLoginFunction().getLogin();
		//registration Page
		pmg.getUserRegistration().GetUsername();
		pmg.getUserRegistration().GetPassword();
		pmg.getUserRegistration().ConfirmPassword();
		pmg.getUserRegistration().FullName();
		pmg.getUserRegistration().Emailaddress();
		pmg.getUserRegistration().CText();
		pmg.getUserRegistration().Tcondition();
		pmg.getUserRegistration().Tandc();
		pmg.getUserRegistration().Register();
		//Search Hotel
		pmg.getSearchHotel().Location();
        pmg.getSearchHotel().Hotel();
        pmg.getSearchHotel().Room_Type();
        pmg.getSearchHotel().Room_number();
        pmg.getSearchHotel().Check_In_Date();
        pmg.getSearchHotel().Check_Out_Date();
        pmg.getSearchHotel().Adultroom();
        pmg.getSearchHotel().Childroom();
        pmg.getSearchHotel().Submit();
        //Select Hotel
        pmg.getSelectHotel().Radio();
        pmg.getSelectHotel().Continue();
        //Book Hotel
        pmg.getBookHotel().Fname();
        pmg.getBookHotel().Lname();
        pmg.getBookHotel().Address();
        pmg.getBookHotel().CCtype();
        pmg.getBookHotel().CC_num();
        pmg.getBookHotel().CC_exp_month();
        pmg.getBookHotel().Expyear();
        pmg.getBookHotel().CC_cvv();
        pmg.getBookHotel().Now();
        //Hotel Confirm
        pmg.getHotelConfirm().Itinerary();
        //BookedItinary
        pmg.getBookedItinery().ITenary();
        pmg.getBookedItinery().Cancel();
        pmg.getBookedItinery().Logout();
		
	}
	
	}
