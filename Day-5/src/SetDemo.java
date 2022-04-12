import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Ram");		
		names.add("John");
		names.remove("John");
		System.out.println(names);
//		names.sort() //no sorting
		
	}
}
