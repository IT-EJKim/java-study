package inheritance;

public class Bird extends Animal{ // 자식 클래스는 부모 클래스를 상속한다.
	// Bird클래스는 Animal이라는 클래스를 상속받게 된다. (부모(슈퍼)-자식(서브) 관계가 됨)
	public void fly() {
		System.out.println("하늘을 난다.");
	}
}
