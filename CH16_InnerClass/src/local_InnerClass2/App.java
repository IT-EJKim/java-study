package local_InnerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	private String name; // 인스턴스 변수

	public App() {
		name = "엘리자베스";
	}

	public static void main(String[] args) {

		App app = new App();

		app.run();
	}
	
	private void run() {
		// 클래스 안의 메소드에 클래스
		
		
		
//		class Printer implements Runnable{
//			@Override
//			public void run() {
//				System.out.println(name); // 내부클래스는 상위클래스의 변수를 사용가능
//			}
//		}
		
//		new Printer().print();
		
//		이런방법도 있고, 매개변수에 직접 넣는 방법도 있다!
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		}, 0L, 1L, TimeUnit.SECONDS);
	}

}
