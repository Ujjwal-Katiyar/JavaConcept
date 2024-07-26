package Java8.JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class User {
	String id;
	String name;
	String email;

	public User(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

class UserService {

	private static List<User> users;

	static {
		users = new ArrayList<>();
		users.add(new User("1", "Alice", "alice@example.com"));
		users.add(new User("2", "Bob", "bob@example.com"));
		users.add(new User("3", "Charlie", "charlie@example.com"));
	}

	public Optional<User> staticfindUserBYId(String id) {
		return users.stream().filter((user) -> user.getId().equals(id)).findAny();
	}

	public static String print() {
		return "This is the supplier method";

	}

}

public class OptionalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Working on optional class");

		Optional<String> op = Optional.ofNullable(null);
		op.ifPresent((nm) -> System.out.println(nm));
		System.out.println(op.isPresent());
		System.out.println(op.isEmpty());

		String s = op.orElse("rphit");
		System.out.println(s);
		op.orElseGet(UserService::print);
		
	}

}
