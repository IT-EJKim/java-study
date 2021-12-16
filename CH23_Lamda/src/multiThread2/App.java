package multiThread2;

public class App {

	private int value = 0;

	private synchronized void increment() { // 이메소드는 힌번에 하나의 쓰레드만 접근
		value++;
	}

	public void run() throws InterruptedException {
		Runnable runnable = () -> {// 멀티 쓰레드
			for(int i = 0; i<100; i++) {
				increment();// value를 1씩 증가
			}
		};
		
		Thread t1 = new Thread(runnable); // 새 스레드 t1 생성
		Thread t2 = new Thread(runnable); // 새 쓰레드 t2 생성

		t1.start(); // t1 실행
		t2.start(); // t2 실행
		
//		System.out.println("Value: " + value); // 메인 쓰레드 실행
		
		t1.join(); // 메인쓰레드가 t1을 싱행할 때까지 대기
		t2.join(); // 메인쓰레드가 t2을 싱행할 때까지 대기
		
		System.out.println("Value: " + value); // t1, t2가 끝난 다음에 출력

	}

	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드
		new App().run();

	}

}
