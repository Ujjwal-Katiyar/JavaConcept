package Java8.Java.entity;

import java.util.Arrays;
import java.util.List;

public class PersionData {

	static List<Person> people;

	static {

		people = Arrays.asList(new Person("Alice", 35, 50000, "HR"), new Person("Bob", 28, 55000, "Engineering"),
				new Person("Charlie", 40, 60000, "Engineering"), new Person("David", 32, 48000, "Finance"),
				new Person("Eve", 25, 70000, "Engineering"));

	}

	public static List<Person> getPerson() {
		return people;
	}
}
