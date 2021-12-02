package method;

import java.util.Random;

public class Gamble {

	public static void main(String[] args) {
		// 어떤 게임이 있다. 이 게임은 주사위를 던져 나오는 눈의 수 만큼 달러를 획득한다.
		// 주사위를 총 3번 던져 얻은 달러. 이를 환전한 결과를 출력하시오
		// math.random() 1과 6 사이의 숫자를 반환하는 dice() 메소드 구현.
		// 1달러의 환율은 1082.25108원으로 한다.
		// 출력 예 ) 획득 금액 : $12.00 (12987원)
		
		
		double dollar = dice() + dice() + dice(); // 주사위 값 세번 더하면 달러
		double won = exchange(dollar);
		
		System.out.printf("획득금액 : $%.2f (%f원)",dollar,won);
		
		
	}
	
	
	
	private static double exchange(double dollar) {
		
		return dollar * 1082.25108;
	}



	public static int dice() {
		
		int result = (int)Math.random()*6+1; // 1부터 6까지의 값 반환
		System.out.println(result);
		return result;
	}

}
