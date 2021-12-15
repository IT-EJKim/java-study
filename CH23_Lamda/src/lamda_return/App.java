package lamda_return;

interface Joiner {
	String join(String text1, String text2); // String 타입으로 리턴
}

public class App {

	public static void main(String[] args) {
		// 리턴값이 있는 경우
		Joiner joiner = (t1, t2) -> {
			String text = t1 + " - " + t2;
			return text;
		};
		
		System.out.println(joiner.join("이에로", "사이다"));
		System.out.println(joiner.join("월요일", "좋아"));
		
		
		
		
		Joiner joiner2 = (s1, s2) -> s1+ " + "+s2; //코드가 한 줄 일때 {} 생략가능. return 도 생략가능.
		System.out.println(joiner2.join("이에로", "사이다"));
		System.out.println(joiner2.join("월요일", "좋아"));
	}

}
