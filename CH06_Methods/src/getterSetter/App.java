package getterSetter;

public class App {

	public static void main(String[] args) {
		// 인스턴스 변수에 접근하는 메소드 get 과 set
		Person p1 = new Person();
		// 보안상 객체의 변수에 바로 접근하지 못함
//		p1.name = "모니카"; // private 를 써줬기 때문. 여기서 name을 쓸 수 없음
		
		p1.setName("모니카");
		
		System.out.println(p1.getName());

		p1.setAge(36);
		System.out.println(p1.getAge());
		
		
		Person p2 = new Person();
		
		p2.setName("립제이");
		System.out.println(p2.getName());
		
		p2.setAge(34);
		System.out.println(p2.getAge());
	}
	

}
