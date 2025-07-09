package utilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Handledateformat {
public static String dateformat(String format)
{
	
	
	//SimpleDateFormat simple=new SimpleDateFormat(format);
	//String date=simple.format(new Date());
	
	//return date;
	
	return new SimpleDateFormat(format).format(new Date());
	}
}
