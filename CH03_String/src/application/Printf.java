package application;

public class Printf {

	public static void main(String[] args) {
		// printf 출력
		int age = 25;
		String addr = "부산진구";
		double pi = 3.14;
		
		System.out.printf("내 나이는 %d살 입니다.\n", age); // printf도 줄띄움이 없음. 그래서 \n 써줘야함
		System.out.printf("내 나이는 %d살이고 %s에 살고 있습니다.\n", age, addr);
		System.out.printf("파이의 값은 : %.2f",pi); //%.2f -> 소수점 2자리까지
	}
	
}


