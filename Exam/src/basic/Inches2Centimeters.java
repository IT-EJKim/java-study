package basic;

public class Inches2Centimeters {

	public static void main(String[] args) {
		// 연습문제6 : 홍팍이의 허리 둘레가 32인치일때 이를, cm로 변환한 결과를 구하시오
		// 1인치는 2.54cm
		// 1. 변수 생성
		// 2. 변환
		// 3. 출력
		
		double inchToCm = 2.54;
		int waist = 32;
		
		System.out.println("홍팍이의 허리 둘레는 "+ (waist * inchToCm)+ "cm이다");
		

	}

}
