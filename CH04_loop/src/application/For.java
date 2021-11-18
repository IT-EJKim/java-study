package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감){명령문;}
		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("i : " + i);
//		}

		
		
//		for (;;) { // 무한반복
//			System.out.println("헬로우!");
//		}
		
		
//		----------------------
		
//		for 반복문을 사용하여 1에서 100 까지의 합을 출력하라
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			
			sum += i;
			
		}
		System.out.println(sum);
		
		
	}

}
