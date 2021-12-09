package instance_of;

import java.io.Serializable;

class Creature implements Serializable {

	private static final long serialVersionUID = 1L;

}

class Cat extends Creature {

	private static final long serialVersionUID = 1L;

}

public class App {

	public static void main(String[] args) {
		// instance of : 객체의 타입을 판별
		Creature c1 = new Creature();
		Object c2 = c1;
		
		Cat c3 = new Cat();
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c1 instanceof Object);
		System.out.println(c1 instanceof Serializable);
		System.out.println(c1 instanceof Creature);
		System.out.println(c1 instanceof Cat);
		
	}

}
