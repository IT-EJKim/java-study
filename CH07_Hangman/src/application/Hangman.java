package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true; // 게임을 계속 진행? 
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	
	// 프로그램을 실행하는 런 메소드
	public void run() {
		do {
			displayWord(); // 화면에 단어표시
			getUsrInput(); // 철자 하나를 입력받음
			checkUserInput(); // 맞는지 체크(전부 맞으면 running = false)
		}while(running);
	}
	
	
	private void displayWord() {
		//2. 랜덤 워드 객체를 생성해 랜덤으로 한단어를 출력한다.
		System.out.println(word.toString());
		
	}
	
	private void getUsrInput() {
//		유저에게 한 문자 입력 요구
//		입력받은 문자열에서 한 문자를 뽑아서
//		RandomWord 객체에 전달 (addGuess(문자) 메소드를 만들자)
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine(); // 입력받은 문자열을 guess에 저장
		// 단어에서 입력받은 문자가 있는지 확인해서 처리한다.(단어는 RandomWord 객체 word를 사용)
		word.addGuess(guess.charAt(0)); // 첫번째 문자를 입력
	}
	
	private void checkUserInput() {
		System.out.println("맞는지 체크");
	}

}
