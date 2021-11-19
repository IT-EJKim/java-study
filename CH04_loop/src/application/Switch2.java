package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// Switch문 문자열 입력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("계속 진행하겠습니까? (y/n): ");
		
		String input = scanner.nextLine(); // 문자열 입력 시 nextLine()
		scanner.close();
		
		
		switch(input) { // 조건
		case "y" : 
			System.out.println("계속 진행합니다.");
		break; // 항상 케이스 하나 끝에 break를 작성.
		case "n" :
			System.out.println("종료합니다.");
			break;
		default: // if~else문의 else와 같음. 위의 케이스에 맞는 것이 없을 때 실행한다.
			System.out.println("잘못된 입력입니다.");
			break;
		}

	}

}
