package timer_Ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;

import javax.swing.JOptionPane;

class Task1 extends TimerTask {
	int i = 0;
	@Override
	public void run() {
		i+=1;
		System.out.println("계란 삶는 중"+i);

	}

}

class Task2 extends TimerTask {

	@Override
	public void run() {

		JOptionPane.showMessageDialog(null, "계란 삶기 완료");

	}

}

public class App {

	public static void main(String[] args) {
		// 1. 5초 간격 타이머 "계란 삶는중"
		// 2. 30초 간격 타이머 "계란 삶기 완료"

		
		// 타이머 1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 5000, 5000); // 5초

		Timer timer30 = new Timer();
		timer30.scheduleAtFixedRate(new Task2(), 30000, 30000);// 30초
	

	}

}
