package application;

public class Final {

	public static void main(String[] args) {
		// 변수 앞에 final 이 붙으면 상수(변하지 않는 값)
		
		final int VALUE  = 9; // 상수는 대문자로 써줘야함 기본규칙
//		VALUE = 11; // 이런식으로 대입할 수 없다. 변하지 않는 값이기 때문에.
		
		System.out.println(VALUE);
		
		final String USER_PASSWORD = "abc";
		
		System.out.println(USER_PASSWORD);
	}

}
