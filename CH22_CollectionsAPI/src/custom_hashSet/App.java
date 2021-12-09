package custom_hashSet;

import java.util.HashSet;

class Creature {
	private int id;
	private String name;

	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Creature [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class App {

	public static void main(String[] args) {
		HashSet<Creature> creatures = new HashSet<>();
		
		creatures.add(new Creature(0, "고양이"));
		creatures.add(new Creature(1, "개"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(3, "소"));
		creatures.add(new Creature(4, "말"));
		creatures.add(new Creature(4, "비둘기"));
		
		System.out.println(creatures.contains(new Creature(0, "고양이")));
		
		creatures.forEach(System.out::println);
		

	}

}
