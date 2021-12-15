package lamda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceAll {

	public static void main(String[] args) {
		// 리스트의 값을 연산결과로 대체한다.
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		
//		numbers.replaceAll(new UnaryOperator<Integer>() {
//			public Integer apply(Integer n) {
//				return n*n;
//			}
//		});
		
		
		// 람다식으로 하면
		numbers.replaceAll(n -> n * n);
		
		numbers.forEach(n -> System.out.println(n));

		List<String> friends = new ArrayList<String>();
		friends.add("가가");
		friends.add("나나");
		friends.add("다다");
		friends.add("라라");
		friends.replaceAll(s -> "안녕~ " + s);
		
		friends.forEach(n -> System.out.println(n));
	}

}
