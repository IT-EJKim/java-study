package application;

public class Switch {

	public static void main(String[] args) {
		// Switch문 
		int option = 0;
		
		
		switch(option) { // 조건
		case 0: // 옵션 변수가 케이스 0 과 같을 때
			System.out.println("옵션 0 선택");
			System.out.println("케이스 0 일 때");
		break; // 항상 케이스 하나 끝에 break를 작성.
		case 1:
			System.out.println("옵션 1 선택");
			break;
		case 10:
			System.out.println("프로그램 종료...");
			break;
		default: // if~else문의 else와 같음. 위의 케이스에 맞는 것이 없을 때 실행한다.
			System.out.println("잘못된 옵션번호.");
			break;
		}

	}

}
