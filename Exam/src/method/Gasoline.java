package method;

public class Gasoline {

	public static void main(String[] args) {
		// 가솔린 8.86L를 충전한 A 자동차는 총 182.736Km를 운행할 수 있다고 한다.
		// 이 차의 연비를 계산하는 메소드를 완성하고, 출력 예와 같은 결과를 얻으시오.
		// 출력 예 -> 연비 :20.62 km/L
		
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calcEffiency(gasoline, distance);
		
		System.out.printf("연비 : %.2f km/L", efficiency);

	}
	
	private static double calcEffiency (double fuel, double distance) {
		
		return distance/fuel;
	}

}
