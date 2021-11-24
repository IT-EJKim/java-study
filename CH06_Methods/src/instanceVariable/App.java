package instanceVariable;

public class App {

	public static void main(String[] args) {
		// 같은 패키지 안에 있는 Person 클래스를 사용한다.
		// 스캐너를 사용할려면 스캐너 클래스를 import 해야됨
		Person p1 = new Person();
		p1.name = "코트";
		p1.age = 3;
		Person p2 = new Person();
		p2.name = "베개";
		p2.age = 1;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
//		Person.name = "홍길동";  // 이러면 에러. 
	}

}
