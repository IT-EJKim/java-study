package constructors;

public class App {

	public static void main(String[] args) {
		// 생성자 : 클래스의 특별한 메소드
		Person p1 = new Person();
		
		//기본 생성자는 생략가능
		p1.setName("모니카");
		p1.setHeight(160);
		
		Person p2 = new Person();
		p2.setName("쌤");
		p2.setHeight(170);
		
		Person p3 = new Person();
//		p3.setName("립제이");
//		p3.setHeight(163);

		System.out.printf("이름 : %s, 키 : %.1f \n",p1.getName(), p1.getHeight());
		System.out.printf("이름 : %s, 키 : %.1f \n",p2.getName(), p2.getHeight());
		System.out.printf("이름 : %s, 키 : %.1f \n",p3.getName(), p3.getHeight());
		
		
	}

}
