package method;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		// 인스턴스 변수의 값이 없을 때 자동으로 0, null로 초기화 됨
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p1.sayHello(); // 메소드 호출
		
		p1.name ="참깨";
		p1.age = 7;
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		p1.sayHello();
		
		Person p2 = new Person();
		p2.name = "파과";
		
		p2.sayHello();
	}

}
