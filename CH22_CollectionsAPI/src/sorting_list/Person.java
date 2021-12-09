package sorting_list;

// 정렬을 할 수 있게 Comparable 비교가능한 인터페이스 구현
public class Person implements Comparable<Person>{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// person객체끼리 비교해서 누가 큰지 코드 작성
		return name.compareTo(o.name);
		// 문자열끼리 비교하는메소드 compareTo 를 사용
	}
}
