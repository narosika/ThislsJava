package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
			
		System.out.println();
		//기본타입을 박싱해서 래퍼스트림으로 바꾸기
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()
			.forEach(obj -> System.out.println(obj.intValue()));
	}
}
