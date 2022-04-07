package calendarhandle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateDATE {

	public static void main(String[] args) throws Exception {
		
		String Date = "35-MAY-1995";
		
		SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		
		try{
			DateFormat.setLenient(false);
			Date FormattedDate = DateFormat.parse(Date);
			System.out.println(FormattedDate);
		}
		
		catch(Exception e) {
			throw new Exception("Invalid date, please provide valid input");
		}
		

	}

}
