package polymorphism;

public class HouseCat extends Cat {
	@Override // 어노테이션 오버라이드
	public void vocal() { // cat클래스에 있는 vocal() 과 똑같은 메소드. 자식클래스에서 부모와 똑같은 메소드를 만들었을때 오버라이딩 메소드라고 한다. 
		System.out.println("미야우~");
	}
	
	
}
