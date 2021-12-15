package hashmap;

import java.util.HashMap;

public class Iteratng_Map {

	public static void main(String[] args) {
		// 맵 타입을 반복문 출력
		HashMap<String, String> months = new HashMap<>();
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");
		
		// 람다식으로 출력
		months.forEach((k,v) -> System.out.println(k + " : " + v));
		System.out.println();
		
		// enterSet() : key와 value 값을 가져옴
		for ( var entry : months.entrySet()) {
			var k = entry.getKey();
			var v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//keySet() 키 값만 가져옴
		for( String key : months.keySet()) {
			String v = months.get(key);
			
			System.out.println(key + " : " + v);
		}
	}

}
