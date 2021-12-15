package lamda_example;

interface Runner {
	void execute(); // 추상메소드 1개 => 람다식을 사용 할 수 있음
}

public class App2 {

	public static void main(String[] args) {
		Runner run = () -> {
			System.out.println("헬로우");
			System.out.println("람다식");
		}; // 실행 코드가 한 줄일 때 코드블록 {} 생략가능
		run.execute();
		
		System.out.println(run instanceof Runner); // run은 Runner의 객체
		System.out.println(run.getClass()); // 클래스는 람다식
	}

}
