package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
	public static void main(String[] args) {
		//미국 로스엔젤리스 시간 가져오기
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance( timeZone );
	
		TimeZone Zone = TimeZone.getTimeZone("US/Hawaii");
		Calendar no = Calendar.getInstance( Zone );
		
		int amPm  = now.get(Calendar.AM_PM);   
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}		
		int hour    = now.get(Calendar.HOUR);                 
		int minute  = now.get(Calendar.MINUTE);             
		int second  = now.get(Calendar.SECOND);        
		
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
		int mPm  = now.get(Calendar.AM_PM);   
		String strmPm = null;
		if(mPm == Calendar.AM) {
			strmPm = "오전";
		} else {
			strmPm = "오후";
		}		
		int hourr    = no.get(Calendar.HOUR);                 
		int minutee  = no.get(Calendar.MINUTE);             
		int secondd  = no.get(Calendar.SECOND);        
		
		System.out.print(strmPm + " ");
		System.out.print(hourr + "시 ");
		System.out.print(minutee + "분 ");
		System.out.println(secondd + "초 ");
		
	}
}
