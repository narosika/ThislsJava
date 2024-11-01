package JhStude.JHgame.GoryonTo3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pley {

	public static void main(String[] args) {
		Random random = new Random();
		
		List<CardSet> pleyrCards = Arrays.asList(
				new CardSet(1, "검정"),
				new CardSet(2, "하양"),
				new CardSet(3, "검정"),
				new CardSet(4, "하양"),
				new CardSet(5, "검정"),
				new CardSet(6, "하양"),
				new CardSet(7, "검정"),
				new CardSet(8, "하양"),
				new CardSet(9, "검정")
				);
		
		//카드셋에서 랜덤컬러를 받기
		int ranIndex = random.nextInt(pleyrCards.size());
		String ranColor = pleyrCards.get(ranIndex).color;
		System.out.println(ranColor);
		
		
		
	}

}
