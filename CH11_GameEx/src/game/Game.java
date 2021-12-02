package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {

	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = { new Scissors(), new Rock(), new Paper() };
	Random random = new Random(); // 랜덤으로.. 해주는...
	Scanner scanner = new Scanner(System.in);

	public void run() {
		System.out.println("삼세판 게임 시작 ... ");
		int wins = 0;

		for (int i = 1; i <= 3; i++) { // i는 1부터 3까지 세번 반복

			// 유저의 선택
			System.out.println("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");

			GameObject ob1 = objects[scanner.nextInt()]; // 내가 입력한 값이 ob1에 담김
			GameObject ob2 = objects[random.nextInt(objects.length)];// objects의 길이만큼의 인덱스를 랜덤으로 뽑아서..ob에 랜덤으로 만든 가위바위보
																		// 중 하나가 들어가게 된다

			System.out.println("당신의 선택은 : " + ob1.getName());
			System.out.println("컴퓨터의 선택은 : " + ob2.getName());

			int result = ob1.compareTo(ob2); // ob1 은 가위바위보 중 셋중하나랜덤. compareTo라는 비교하는 메소드를 통해 ob2(가위바위보)를 비교
			wins += result; // 세판의 결과를 wins에 더해주는거임. 결국은 세판이 끝났을 때 양수면 이긴거, 0이면 비긴거, 음수면 진거.
			if (result > 0) {
				System.out.println("당신의 승리!✨✨");
			} else if (result < 0) {
				System.out.println("당신의 패배..😥😥");
			} else {
				System.out.println("비겼습니다!💥💥");
			}
		}
		
		// 세번 가위바위보 끝난 후 총점 wins로 전체 결과가 승인지 패인지를 출력한다.
		System.out.println();
		System.out.println("삼세판 결과는 : ");
		if (wins > 0) {
			System.out.println("당신의 승리!✨✨");
		} else if (wins < 0) {
			System.out.println("당신의 패배..😥😥");
		} else {
			System.out.println("비겼습니다!💥💥");
		}
	}
}
