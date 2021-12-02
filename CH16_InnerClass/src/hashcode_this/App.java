package hashcode_this;

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox();
		System.out.println(fox1);
		System.out.println(fox1.toString());
		System.out.printf("%x \n", fox1.hashCode()); //hashcode는 @뒤에 숫자
		
		Fox fox2 = fox1;
		System.out.println(fox2);
		System.out.println(fox2.name);
	}

}
