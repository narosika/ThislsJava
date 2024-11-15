package JhStude.JHgame.GoryonTo3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pley {
	static  Scanner sc= new Scanner(System.in);
	//점수
	static  int	playerScore = 0;
	static int cpuScore = 0;

	public static void main(String[] args) {
		Random random = new Random();



		//카드셋 만들기
		List<CardSet> pleyrCards = createCardSet();
		List<CardSet> cpuCardSets = createCardSet();
		System.out.println(pleyrCards);
		System.out.println(cpuCardSets);
		
		//시작플레이어 랜덤으로 고르기
		boolean playerStarts = random.nextBoolean();
		System.out.println(playerStarts ? "내가 시작플레이어 입니다." : "CPU 가 시작플레이어 입니다.");


		//게임시작
		while(playerScore < 5 && cpuScore < 5) {

			//숫자 내는기능
		System.out.println("숫자를 내세요");
		int pleyrNum = sc.nextInt();
		String pleyrColer = pleyrCards.get(pleyrNum).color;
		System.out.println(pleyrColer);

			//컴퓨터 숫자 랜덤으로 내는기능
		int cpuNum = random.nextInt(cpuCardSets.size());

		roundWinner(pleyrNum, cpuNum);
		pleyrCards.remove(pleyrNum);
		cpuCardSets.remove(cpuNum);

		System.out.println("플레이어 점수: " + playerScore);
		System.out.println("현재남은 숫자 = " + pleyrCards.size());
		}



	}

	//승리자 결정 메소드
	static void roundWinner(int pleyrNum, int cpuNum) {
		if(pleyrNum == 1 && cpuNum == 9 ) {
			playerScore++;
			System.out.println("플레이어 승리");
		}else if (cpuNum == 1 && pleyrNum == 9){
			cpuScore++;
			System.out.println("컴퓨터 승리");
		}else if (pleyrNum > cpuNum){
			playerScore++;
			System.out.println("플레이어 승리");
		} else if(pleyrNum < cpuNum) {
			cpuScore++;
			System.out.println("컴퓨터 승리");
		} else if(pleyrNum == cpuNum) {
			System.out.println("비겼습니다.");
		}
	} 

	private static List<CardSet> createCardSet() {
		return Arrays.asList(
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
	}
		
}


