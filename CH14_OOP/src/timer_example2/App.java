package timer_example2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable { // Runnable 인터페이스에 있는 run 추상메소드를 여기서 구현

	@Override
	public void run() {
		// 할일의 코드를 적는다.
		System.out.println("헬로우~");
		
	}
	
}

public class App {

	public static void main(String[] args) {
		// 타이머 2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS); // 초단위로 셋팅. 1초 주기로 반복한다.
		

	}

}
