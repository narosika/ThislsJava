package ch15.exam.ex09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	 public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("while", 92);
		 
		String name = null;
		int MaxScore = 0;
		int totalScore = 0;
		double xx=0.0;
		
		Set<String> keyset = map.keySet();
		Iterator<String> ita = keyset.iterator();
		
		while(ita.hasNext()) {
			
			String va = ita.next();
			int score = map.get(va);
			int sum=0;
			totalScore = totalScore+score;
			double xxx = totalScore/map.size();
			
			xx = xxx;
			
			
			//최고점수
			if(MaxScore<score) {
				MaxScore = score;
				name = va;
			}
			
		}
		
		System.out.println("평균점수 = " + xx);
		System.out.println("최고점수: " + MaxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
		
		 
	}
}
