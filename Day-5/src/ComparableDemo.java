import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class User implements Comparable<User> {

	String name;
	int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "{" + name + ", " + age + "}";
	}

	@Override
	public int compareTo(User o) {
		return this.age - o.age;
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		List<User> users = new LinkedList<>();

		users.add(new User("Ram", 45));
		users.add(new User("John", 32));
		System.out.println(users);
//		usingComparator(users);
		usingComparable(users);
	}

	private static void usingComparable(List<User> users) {
		Collections.sort(users);
		System.out.println(users);
	}

	private static void usingComparator(List<User> users) {
		users.sort(new Comparator<User>() {
			@Override
			public int compare(User user1, User user2) {
				return user1.name.compareTo(user2.name);
			}
		});
		System.out.println(users);
	}
}
