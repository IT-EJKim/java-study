package casting;

public class App {

	public static void main(String[] args) {
		// 캐스팅 실습
		Cat cat1 = new HouseCat(); // 객체는 하우스캣
		cat1.vocal();
		cat1.hunt();
//		cat1.call(); // cat1은 Cat타입이기 때문에 Cat 클래스에 없는 메소드를 사용할 수 없다.
		
	
		// call 을 사용하려면 다운 캐스팅
		HouseCat cat2 = (HouseCat)cat1; //cat1이 원래 HouseCat이었기 때문에 다운캐스팅이되는거!
		cat2.call();
	}

}
