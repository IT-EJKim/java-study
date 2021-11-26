package application;

import game.Game;

public class App { // App에서 실행하기!!! 

	public static void main(String[] args) {
		// 여기부터 프로그램 시작
//		Game game = new Game(); // game클래스 만들어서
//		game.run(); // run메소드 호출하기
		
		new Game().run();  //  Game game = 이 빠졌음. 굳이 안써도된다. 뱌로 run()만 실행하면 되는거라서.
		
		// 클래스 불러오기 할 때 ctrl + shift + o 하면 여러개 한꺼번에 임포트가능
		
	}

}
