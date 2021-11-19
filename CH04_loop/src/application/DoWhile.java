package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//사용법
		// do while은 처음 한번은 조건과 상관없이 실행됨
//		int count = 0;
//		
//		System.out.println("do while 반복문");
//		
//		do { // 참이어도 거짓이어도 do의 코드는 무조건 실행된다.
//			System.out.println("카운트 : "+count); 
//		} while(count++ < 5);

		
		final String USER_PASSWORD = "hello";
		
		String password = ""; // 문자열 선언. 초기값은 공백으로. 

		Scanner scanner = new Scanner(System.in);
	

		do {
			System.out.print("비번을 입력 > ");
			password = scanner.nextLine();  // password변수가 코드블럭 안에서 선언됨 -> 지역변수. 밖에서 사용불가 
			
		} while(password.equals(USER_PASSWORD) == false); // password가 true인데 false랑 같냐하면 false가 나오겠지.false가 되어야 빠져나온다. true면 계속 반복
//		  while(!password.equals(USERT_PASSWORD)) 해줘도 같다. // !true는 false이고 !false는 true이다.
		
		System.out.println("접속 승인"); // 조건이 true일때 while에서 빠져나오기 때문에. false면 계속 반복한다.
	}

}
