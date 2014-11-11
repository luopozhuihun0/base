package crown.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
	static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static String now() {
		return TIME_FORMAT.format(new Date());
	}
	
	public static String date() {
		return DATE_FORMAT.format(new Date());
	}
}
