package application;

public class Cat {
	private String name; // 이름
	
	public static final String FOOD = "고양이 사료"; // 스태틱 상수
	private int id; // 아이디(고유번호, 중복되면 안됨)
	// 스테틱 변수(객체들에 공유됨)
	public static int count = 0; // 스태틱이 붙으면 스태틱변수. 초기값 0
	
	public Cat(String name) {
		this.name = name;
		count++;
		id = count; // 고유번호! 객체가 만들어질때마다 카운트값이 증가하면서 저장
	}

	public static int getCount() {
		// 스테틱메소드는 일반 인스턴스(객체) 변수 사용 불가
//		String s = name; // 이렇게 하면 에러가 된다.
		// 객체가 만들어지기 전에 사용가능하므로 인스턴스 변수는 사용할 수 가 없다.
		
		return count; // 스테틱 변수는 사용가능
	}

	@Override
	public String toString() {
		return "Cat [이름=" + name + ", id=" + id + "]";
	}
	

	
}
