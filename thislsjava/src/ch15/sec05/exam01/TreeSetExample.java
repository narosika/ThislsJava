package ch15.sec05.exam01;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//TreeSet 컬렉션 생성
		TreeSet<String> scores = new TreeSet<>();
		//Integer 객체 저장
		scores.add("ㄱ");
		scores.add("ㄴ");
		scores.add("ㄷ");
		scores.add("ㄹ");
		scores.add("ㅁ");
		//정렬된 Integer 객체를 하나씩 가져오기
		for(String s : scores) {
			System.out.print(s + " ");
			}
		System.out.println("\n");
		
		//특정 Integer 객체를 가져오기
		System.out.println("가장 낮은: " + scores.first());
		System.out.println("가장 높은: " + scores.last());
		System.out.println("ㄹ 아래 점수: " + scores.lower("ㄹ"));
		System.out.println("ㄱ 위의 점수: " + scores.higher("ㄱ"));		
		System.out.println("ㄴ 이거나 바로 아래 점수: " + scores.floor("ㄴ"));
		System.out.println("ㄹ 이거나 바로 위의 점수: " + scores.ceiling("ㄹ") + "\n");
		
		
		/*
		//내림차순으로 정렬하기
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//범위 검색( 80 <= )
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//범위 검색( 80 <= score < 90 )
		rangeSet = scores.subSet(80, true, 90, false);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		*/
	}
}

