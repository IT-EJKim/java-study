package basic;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 연습문제 7
		// 두개의 정수 a,b를 입력 받아 곱과 몫, 나머지를 출력하시오.
		
		// 1. 입력 값을 변수로 저장
		
		// 2.결과 출력
		// printf 사용
		
		System.out.println("두 개의 정수를 입력하시오 > ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		
		System.out.printf("곱하기 : %d x %d = %d\n",a,b,(a*b));
		System.out.printf("나누기 몫 : %d / %d = %d\n",a,b,(a/b));
		System.out.printf("나누기 나머지 : %d / %d = %d\n",a,b,(a%b));

	}

}
