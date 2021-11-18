package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연산자 ++ -- 위치가 다른 경우
		// 뒤에 있을 경우 먼저 사용하고 증감, 앞에 있을 경우 먼저 증감하고 사용
		
		int x = 5;
		System.out.println(x++); // 5가 출력. x를 먼저 사용(출력)하고, 증감. 출력 후 x는 6이됨 
		System.out.println(x); // 6이 출력
		
		int y = 3;
		System.out.println(++y); // 4가출력
		
		int z = 10;
		
		int sum = x + z++; // 6+10, 이제 z 는 11이됨
		System.out.println(sum); //16이 출력
		
		
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++; // 6 + 4니까 10
		System.out.println(fruits);
	}

}
