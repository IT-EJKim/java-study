package exampleMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}


public class App {

	public static void main(String[] args) {
		// 맵을 사용한 예제
		HashMap<Person, Boolean> people1 = new HashMap<>();
		LinkedHashMap<Person, Boolean> people2 = new LinkedHashMap<>();
		TreeMap<Person, Boolean> people3 = new TreeMap<>();
		
		
		

	}

}
