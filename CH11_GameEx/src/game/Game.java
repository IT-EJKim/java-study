package game;

import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {

	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = { new Scissors(), new Rock(), new Paper() };
	Random random = new Random(); // 랜덤으로.. 해주는...
	
	public void run() {
		System.out.println("게임 시작 ... ");
		
		int num = random.nextInt(objects.length); // objects의 길이만큼의 인덱스를 랜덤으로 뽑아서.. num에 담는다
		GameObject ob = objects[num]; // ob에 랜덤으로 만든 가위바위보 중 하나가 들어가게 된다
		System.out.println(ob);
		
	}

}
