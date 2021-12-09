package sorting_list;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// 리스트를 정렬
		ArrayList<Double> doubles = new ArrayList<>();

		doubles.add(7.38);
		doubles.add(7.2);
		doubles.add(4.38);
		doubles.add(4.01);
		doubles.add(5.04);

		Collections.sort(doubles);

		doubles.forEach(System.out::println);

		// 기본타입 숫자등은 값으로 정렬, 문자열, 문자 등은 알파벳순 정렬 한글은 가나다라순

		// 커스텀 객체의 정렬
		ArrayList<Person> people = new ArrayList<>();

		people.add(new Person("아이키"));
		people.add(new Person("노제"));
		people.add(new Person("모니카"));
		people.add(new Person("허니제이"));

		Collections.sort(people); // 정렬

		people.forEach(System.out::println);
	}

}
