package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit; // 다른 패키지이기 때문에 import해줘야함

public class App {

	public static void main(String[] args) {
		
		Fruit f1 = new Apple();
//		f1.id=2;  // protected 이기 때문에 사용불가.
		System.out.println(f1.toString());
	
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}

}
