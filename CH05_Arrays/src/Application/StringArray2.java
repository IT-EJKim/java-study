package Application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은참조 자료형, 참조 변수(reference variable)은 주소값을 가진다.
		String text = null; // 널값은 주소값이 없다.
		// int x = null; // 이건 안된다. 기본 자료형에는 널값을 입력할 수 없다. 널값은 주소가 없다는 의미이기 때문.
		
		text = new String("헬로우"); // new 는 새로 생성한다. 이게 문법이지만 밑에처럼 써도 된다.
//		text = "헬로우";
		
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3]; // 배열 문자열 3칸을 실제 생성해서 texts에 주소입력
		System.out.println(texts); // 주소가 출력됨
		System.out.println(texts[0]); // 3칸중 첫번째 칸의 값을 출력 => null
		
		texts[0] = new String("하이!");
		texts[1] = "안녕?";
		texts[2] = "굿바이";
		
		for(String w : texts) {
			System.out.println(w);
		}
		
				
		
	}

}
