package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	public static int sum;
	public static int sum1;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1,  100);	//100까지 수를 포함
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
		
		IntStream stream1 = IntStream.range(1,  100);	//100은 포함하지 않음
		stream1.forEach(a -> sum1 += a);
		System.out.println("총합: " + sum1);
	}
}



