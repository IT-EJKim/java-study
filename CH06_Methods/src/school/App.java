package school;

public class App {

	public static void main(String[] args) {
		// 학생 객체를 만들기
		Student s1 = new Student("모니카", 34);
		Student s2 = new Student("야옹이", 12);
		Student s3 = new Student("멍멍이", 10);
		Student s4 = new Student("막내", 3);
		
		s1.setVisible(false); // 모니카는 원격이라 온도측정 안함
		
		s2.setTemperature(35.5); // 야옹이는 집체. 체온 35.5
		
		s3.setTemperature(36.5); // 멍멍이는 집체. 체온 36.5
		
		s4.setVisible(false); // 막내는 원격.
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());

	}

}
