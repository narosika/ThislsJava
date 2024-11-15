package JhStude.JHgame.goryungTo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Pley2 {
	static Random random = new Random(); 
	static TreeMap<Integer, String> cardSet = new TreeMap<Integer, String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		cardSet.put(1, "검정");
		cardSet.put(2, "하양");
		cardSet.put(3, "검정");
		cardSet.put(4, "하양");
		cardSet.put(5, "검정");
		cardSet.put(6, "하양");
		cardSet.put(7, "검정");
		cardSet.put(8, "하양");
		cardSet.put(9, "검정");

		System.out.println(cardSet.values());
		/* 
		//내가 가지고 있는 수 알려주기
		Set<Integer> pleyerSet = cardSet.keySet();
		Stream<Integer> pleyerSet1 = pleyerSet.stream();
		System.out.println("아직 가지고 있는 수: ");
		pleyerSet1.forEach( n -> System.out.print(n));
		System.out.println();
		
		//컴퓨터가 가지고있는 갯수 알려주기
		Set<Entry<Integer, String>> cpuSet = cardSet.entrySet();
		//Stream<Entry<Integer, String>> cpuSet1 = 
				cpuSet.stream()
				.forEach( n -> System.out.print(n.getValue()));
				System.out.println();
				 */
		
		/*
		//어레이리스트에 맵컬렉션 담아보기
		List<Integer> cpuCards = new ArrayList<Integer>(cardSet.keySet());
		//System.out.println(cpuCards.get(0));
		
		Iterator<Integer> cardIterator = pleyerSet.iterator();
		//System.out.println("내가 가진 수: " + );
		*/
		
		/*
		//내가낼수 메소드 나중에만들기
		System.out.print("내가 낼 수 ");
		int select = sc.nextInt();
		String mt = cardSet.get(select);
		System.out.println(mt);
		*/
				
		/*
		cpuCho();
		 */
		
		
		sc.close();
	}
	//여기까지 메인메소드
	static List<Integer> cpuCards = new ArrayList<Integer>(cardSet.keySet());
	
	
	  //cpu 가 랜덤으로 1장 내는 메소드 만들기 
	  public static void cpuCho () {
		  System.out.println(cpuCards.size());
		  //int x = random.nextInt(cpuCards.size()); 
		  
	  
	  }
	 
	
		
	
}
