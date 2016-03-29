package cn.xypro.test.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrUtils {
	
	public static String getCurrnetDate(){
		
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		return dateFormat.format(new Date(System.currentTimeMillis()));
	}

}
