package overridingMethod;

public class App {

	public static void main(String[] args) {
		// 메소드 오버라이딩
		Cat cat1 = new Cat();
		cat1.vocal();
		
		HouseCat cat2 = new HouseCat();
		cat2.vocal(); // 자식클래스의 메소드로 덮어씌어짐
		cat2.hunt();
		
		RoadCat cat3 = new RoadCat();
		cat3.vocal();
		cat3.hunt();
	}

}