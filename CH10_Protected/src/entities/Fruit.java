package entities;

public class Fruit {
	protected int id; // protected 다른 패키지에서는 사용할 수 없다. 상속한 자식 클래스에서는 사용할 수 있음

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}
	
	
}
