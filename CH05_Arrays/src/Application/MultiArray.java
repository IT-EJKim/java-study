package Application;

public class MultiArray {
	public static void main(String[] args) {
		// 이중 배열
		String[][] texts = {
				{"하나", "둘", "셋"},
				{"넷", "다섯", "여섯"},
				{"일곱", "여덟", "아홉"}
		};
		
		for(int i = 0; i<texts.length; i++) {
			System.out.printf("%d번째 배열 %s \n",i,texts[i]); // 주소를 출력함
			String[] inArray = texts[i]; // 첫번째 배열을 inArray에 대입 { 하나 둘 셋 } 그 첫째배열
			
			for(int j = 0; j < texts[i].length; j++) { // inArray의 길이는 세개 하나, 둘, 셋 의 세개.
				System.out.printf("%s \t",texts[i][j]); // 그 값을 출력
			}
			System.out.println();
		}
		
	}
}
