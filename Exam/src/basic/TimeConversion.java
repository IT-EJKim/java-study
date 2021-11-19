package basic;

public class TimeConversion {

	public static void main(String[] args) {
		////////다시 풀어보기~/////////
		
		// 연습문제8 : 7582초를 00시간 00분 00초로 변환하시오.
		
		// 1. 변수생성
		// 2. 변환
		// 3. 출력
		
		int totalSec = 7582;
		int min = totalSec / 60; // hour = 2.1시간
		int sec = totalSec % 60; // 
		int hour = min / 60;
		int Dhour = min % 60;
//		System.out.println(min);
//		System.out.println(sec);
		System.out.println(hour + "시간"+Dhour+"분"+sec+"초");
		
		
		
		

	}

}
