package method;

public class Pork {

	public static void main(String[] args) {
		// 삼겹살 1인분의 무게는 180g, 삼겹살 1g의 칼로리가 5.179kcal
		// 삼겹살 3인분의 칼로리를 소수점 이하 둘째 자리까지 출력하시오.
		
		double result = porkCal(3);
		int pork = 0;
		System.out.printf("삼겹살 3인분 : %.2fkcal",result );
		

	}

	private static double porkCal(int pork) {  // pork에 ㅇ인분이 들어갈거임
		
		return pork * 180 * 5.179;
	}

}
