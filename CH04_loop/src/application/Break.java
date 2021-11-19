package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 break; 사용 시 빠져나옴
		int count = 0;
		
		while(true) { // true가 들어있기 때문에 무한반복
			System.out.println("헬로우! " + count);
			
			if(count == 5) {
				break; // 반복문 종료
			}
			System.out.println("하 아 유?");
			
			count++;
		}

		System.out.println("종료");
	}

}
