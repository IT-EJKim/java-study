package basic;

public class Income {

	public static void main(String[] args) {
		// 1. 변수 생성
		// 2. 총합 계산
		// 3. 총합 출력
		// printf() 메소드
		
		double mon = 8.62;
		double tue = 10.23;
		double wed = 12.48;
		double thr = 7.82;
		double fri = 9.54;
		
		double total = mon + tue + wed + thr + fri;
		
		System.out.printf("$ %.2f", total); // .x 가 소수점 x까지 라는 의미

	}

}
