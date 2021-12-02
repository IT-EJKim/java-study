package anonymous_Class;

public class App {

	private String name = "멍멍이";

	public static void main(String[] args) {
		// 익명클래스는 이름 없는 클래스
		new App().start();
	}

	private void start() {
//		System.out.println(name);
//		Runnable인터페이스는 객체를 만들 수 없지만 익명클래스를 바로 만들어 추상메소드를 구현하여 사용가능
		Runnable runner = new Runnable() { // 익명클래스는 runnable의 추상클래스를 구현할 수 있다
			public void run() { // 익명클래스
				System.out.println(name);
			}
		};
		
		Runnable runner2 = new Runnable() {
			public void run() {
				System.out.println("헬로우 " + name);
			}
		};
		
//		runner.run();
//		runner2.run();
//		activate(runner);
//		activate(runner2);
		
		// 매개변수로 인터페이스의 객체가 입력일경우 익명클래스를 이용해 바로 작성가능
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		
	}
	
	public void activate(Runnable runnable) {
		runnable.run(); // 인터페이스의 추상메서드 실행
	}
}
