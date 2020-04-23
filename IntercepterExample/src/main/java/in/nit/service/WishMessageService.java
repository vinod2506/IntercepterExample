package in.nit.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service
public class WishMessageService implements WishMsg {

	public String generateWishMsg() {
		Calendar cal=null;
		int hour=0;
		int minute=0;
		
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		minute=cal.get(Calendar.MINUTE);
		System.out.println("minute :"+minute);
		System.out.println("hour :"+hour);
		if(hour<=11 && minute<=59)
			return	"Good Morning";
		else if(hour<=15 && minute<=59)
			return "Good Afternoon";
		else if(hour<=19 && minute<=59)
			return	"Good Evening";
		else 
			return "Good Night";

	}
	
	
}
