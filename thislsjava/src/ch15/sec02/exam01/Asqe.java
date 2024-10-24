package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class Asqe {
	public static void main(String[] args) {
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();
		//객체 추가
		for (int i = 1 ; i<6 ; i++) {
			list.add(new Board("제목"+i+"", "내용"+i+"", "글쓴이" +i));
		
		}

		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();		

		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board);
		System.out.println(board.getSubject() + "\t" + board.getContent() + 
													"\t" + board.getWriter());
		System.out.println();
		
		//모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + 
													"\t" + b.getWriter());
		}		
		System.out.println();
		
		boolean aa = list.contains(board);
		System.out.println("제목1 여부: "+ aa);

		//객체 삭제
		list.remove(2);
		list.remove(2);
		
		//향상된 for문으로 모든 객체를 하나씩 가져오기
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + 
													"\t" + b.getWriter());
		}
	}
}

