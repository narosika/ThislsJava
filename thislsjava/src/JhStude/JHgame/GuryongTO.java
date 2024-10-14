package JhStude.JHgame;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuryongTO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1~ 9까지의 숫자 2세트 만들기
        List<Integer> playerSet = new ArrayList<>();
        List<Integer> cpuSet = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            playerSet.add(i);
            cpuSet.add(i);
        }

        // 점수 만들기
        int playerScore = 0;
        int cpuScore = 0;

        // 시작플레이어 랜덤으로 고르기
        boolean playerStarts = random.nextBoolean();
        System.out.println(playerStarts ? "내가 시작플레이어 입니다." : "CPU 가 시작플레이어 입니다.");

        // 게임시작
        System.out.println("구룡투 게임을 시작합니다");
        System.out.println("홀수는 흰색 짝수는 검정색 입니다.");
        
        while (playerScore < 5 && cpuScore < 5) {
            System.out.println("\n--- 새로운 라운드 ---");
            System.out.println("남은 숫자: " + playerSet);

            int playerNum, cpuNum;

            // 시작플레이어를 결정
            if (playerStarts) {
                playerNum = playerChoice(scanner, playerSet);
                playerSet.remove(Integer.valueOf(playerNum));
                System.out.println("내 색깔: " + announceParity(playerNum));

                cpuNum = cpuChoice(random, cpuSet);
                cpuSet.remove(Integer.valueOf(cpuNum));
                System.out.println("CPU 색깔: " + announceParity(cpuNum));
            } else {
                cpuNum = cpuChoice(random, cpuSet);
                cpuSet.remove(Integer.valueOf(cpuNum));
                System.out.println("CPU 색깔: " + announceParity(cpuNum));

                playerNum = playerChoice(scanner, playerSet);
                playerSet.remove(Integer.valueOf(playerNum));
                System.out.println("내 색깔: " + announceParity(playerNum));
            }

            // 라운드의 승리자를 결정
            String roundWinner = determineWinner(playerNum, cpuNum);
            if (roundWinner.equals("player")) {
                playerScore++;
                System.out.println("이번 라운드는 내가 이겼다!");
                playerStarts = true; 
            } else if (roundWinner.equals("cpu")) {
                cpuScore++;
                System.out.println("CPU 가 이겼다");
                playerStarts = false; 
            } else {
                System.out.println("이번 라운드는 동점입니다...");
                playerStarts = !playerStarts; 
            }

            // 나와 CPU의 현재점수를 표시
            System.out.println("현재점수 -> 나: " + playerScore + ", CPU: " + cpuScore);
        }

        // 게임종료 조건 설정
        if (playerScore == 5) {
            System.out.println("\n 내가 이겼다!");
        } else {
            System.out.println("\n CPU 가 이겼습니다 조금 더 생각하세요!");
        }

        scanner.close();
    }

    // 내가 낼 숫자를 선택하는 기능
    private static int playerChoice(Scanner scanner, List<Integer> playerSet) {
        int choice;
        while (true) {
            System.out.print("이번에 낼 숫자를 선택하세요: ");
            choice = scanner.nextInt();
            if (playerSet.contains(choice)) {
                return choice;
            } else {
                System.out.println("잘못된 선택입니다 다시 선택하세요.");
            }
        }
    }

    // 컴퓨터가 무작위로 숫자를 내게 하는 기능
    private static int cpuChoice(Random random, List<Integer> cpuSet) {
        return cpuSet.get(random.nextInt(cpuSet.size()));
    }

    // 숫자를 기준으로 검정과 하양을 구별하는 기능
    private static String announceParity(int num) {
        return num % 2 == 0 ? "Black" : "White";
    }

    //라운드의 승리자를 결정하는 기능
    private static String determineWinner(int playerNum, int cpuNum) {
        if (playerNum == cpuNum) {
            return "tie";  
        } else if ((playerNum == 1 && cpuNum == 9) || (cpuNum == 1 && playerNum == 9)) {
            // 1이 유일하게 이기는 9를 설정
            return playerNum == 1 ? "player" : "cpu";
        } else if (playerNum > cpuNum) {
            return "player";
        } else {
            return "cpu";
        }
        
    }
}
