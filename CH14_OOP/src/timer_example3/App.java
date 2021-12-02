package timer_example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable { // Runnable 인터페이스에 있는 run 추상메소드를 여기서 구현

	@Override
	public void run() {
		// 할일의 코드를 적는다.
		System.out.println("헬로우~");
		
	}
	
}

class Task2 extends TimerTask { // TimerTask가 추상클래스
	@Override
	public void run() { // run() 이 추상메소드이기 때문에 여기서 구현.
		System.out.println("헬로우");
	}
}

public class App {

	public static void main(String[] args) {
		
		
		// 타이머 2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task1(), 0, 1, TimeUnit.SECONDS); // 초단위로 셋팅. 1초 주기로 반복한다.
		
		// 타이머 1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task2(), 0L, 1000L);
		

	}

}
