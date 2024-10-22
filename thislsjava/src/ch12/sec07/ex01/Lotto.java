package ch12.sec07.ex01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.random.RandomGenerator;

public class Lotto {
	public static void main(String[] args) {
		int[] loNum = new int [6];
		Random aa = new Random();
		List lotto = new ArrayList<>();
		Set lotto2 = new HashSet<>();
		
		for(int i=0 ; i<loNum.length; i++)
		{
			if(loNum[i] == 0) {
				loNum[i] = aa.nextInt(45);
			}
			System.out.print(loNum[i] + " ");
		}
		
		System.out.println(loNum);

		for(int  i=0 ; i<6 ; i++) {
		lotto.add(aa.nextInt(45));

		}
		System.out.println(lotto);
		
		for(int  i=0 ; i<6 ; i++) {
		lotto2.add(aa.nextInt(lotto.size()));

		}
		System.out.println(lotto);
		
		
	}
	
	
	
	
	

}
