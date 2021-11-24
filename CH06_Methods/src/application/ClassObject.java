package application;

// 하나의 파일에 여러개의 클래스를 만들 수 있다.
class Person {
	String name;
}

// public class는 한 파일에 하나만 생성가능. 그리고 그 이름은 파일이름과 같음
public class ClassObject {

	public static void main(String[] args) {
		// 클래스와 객체
		// 클래스는 설계도이고 이 클래스로 실제 사용가능한 객체를 생성(객체는 실제 메모리에 생성됨 = 인스턴스)
		Person p1 = null; // 선언. 참조변수 person 클래스 타입의 p1이다. 초기값 없음
		System.out.println(p1);
		p1 = new Person(); // person의 실제 객체를 생성하여 그 주소값을 p1에 대입.
		System.out.println(p1); // person 객체의 주소값이 출력
		
		p1.name = "이름";
		
		Person p2 = new Person();
		p2.name = "고양이";
		Person p3 = new Person();
		p3.name = "강아지";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		
		

	}

}
