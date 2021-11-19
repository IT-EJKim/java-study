package Application;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열을 생성한다.
		// int[] n = {1,2,3}; //초기값을 바로 넣는 법. 리터럴이라고 한다.
		
		int[] numbers = new int[3]; // 실제 정수형 3개의 배열을 만듦 (칸만 만든거임.값은 없음아직)
		
		numbers[0] = 99;
		numbers[1] = 999;
		numbers[2] = 9999;
		
		int total = 0;
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "   ");
			total += numbers[i]; //모든 배열의값을 더함
		}
		
		System.out.println("총 합계는 : " + total);

	}

}
