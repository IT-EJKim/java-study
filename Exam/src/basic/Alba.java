package basic;

import java.util.Scanner;

public class Alba {

	public static void main(String[] args) {
//		연습문제4
//		1. 입력값 대입 
//		2. 월급 계산
//		3. 출력
		
//		입력 예 : 8000 160
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시급과 일한 시간을 입력하시오");
		int wage = scanner.nextInt();
		int hour = scanner.nextInt();
		scanner.close();
		
		int money = wage * hour;
		
		System.out.println(money);
		

	}

}
