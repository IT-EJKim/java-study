package application;

import java.util.Scanner;

public class SelectOption {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("옵션을 선택 > ");
		int menu = scanner.nextInt();
		
		if (menu == 1) {
			System.out.println("헬로우");
		} else if (menu == 2) {
			System.out.println("안녕?");
		} else if (menu == 3) {
			System.out.println("프로그램 종료");
		} else if (menu == 10000 ) {
			System.out.println("이스터에그🎅");
			}
		else {
			System.out.println("잘못된 옵션입니다.");
		}
		
		

	}

}
