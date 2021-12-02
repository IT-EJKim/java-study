package local_InnerClass;

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
		
		class Printer {
			public void print() {
				System.out.println(name); // 내부클래스는 상위클래스의 변수를 사용가능
			}
		}
		
		new Printer().print();
	}

}
