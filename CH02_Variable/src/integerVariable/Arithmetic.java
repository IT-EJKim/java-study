package integerVariable;

public class Arithmetic {

	public static void main(String[] args) {
		// 숫자 계산
		System.out.println(7+3);
		System.out.println(9/3);
		
		System.out.println(10/3); // 정수 나누기 정수는 정수다!
		
		System.out.println(10.0/3.0);
		System.out.println(9/4.0); // 정수 나누기 실수. 이때 큰 값 타입으로. 정수는 4바이트 실수는 8바이트라서 실수로 계산됨
		System.out.println(3*4);
		System.out.println(3*4.0);
		System.out.println(3-4);

	}

}