package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args)
	//숫자 + 문자 출력하기
	{int hour = 3;
	int minute = 5;
			//3시간 5분 문장으로 출력하기
	System.out.println(hour + "시간 "+ minute + "분");
		
	int totalminute = (hour*60) + minute;
	// 총 x분 이라고 출력하기(시간 없앰
	System.out.println("총" + totalminute + "분");
	
	
	}

}
