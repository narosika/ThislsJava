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

public class Pley {
	static Random random = new Random(); 
	static TreeMap<Integer, String> cardSet = new TreeMap<Integer, String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Integer, String> cardSet = new TreeMap<Integer, String>();
		
		cardSet.put(1, "검정");
		cardSet.put(2, "하양");
		cardSet.put(3, "검정");
		cardSet.put(4, "하양");
		cardSet.put(5, "검정");
		cardSet.put(6, "하양");
		cardSet.put(7, "검정");
		cardSet.put(8, "하양");
		cardSet.put(9, "검정");
		
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
				
		
		//어레이리스트에 맵컬렉션 담아보기
		List<Integer> pleyerCard = new ArrayList<Integer>(cardSet.keySet());
		System.out.println(pleyerCard.get(0));
		
		
		Set<Entry<Integer, String>> cpuSete = cardSet.entrySet();
		Iterator<Integer> cpuSetee = pleyerSet.iterator();
		//System.out.println("내가 가진 수: " + );
		
		System.out.print("내가 낼 수 ");
		int select = sc.nextInt();
		String mt = cardSet.get(select);
		System.out.println(mt);

		
		
		sc.close();
	}
	//여기까지 메인메소드
	

		
	
}
