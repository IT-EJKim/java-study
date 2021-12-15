package example;

public class Split_String {

	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1 = "";
		
		String[] words = text1.split("[^a-zA-Z]+"); //영문철자를 제외한 특수문자 스페이스 점 슬래시
		
		for(String w : words) {
			System.out.println(w);
		}
	}

}
