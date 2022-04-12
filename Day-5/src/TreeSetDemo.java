import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> sortedNumbers = new TreeSet<>();
		sortedNumbers.add(4);
		sortedNumbers.add(-1);
		System.out.println(sortedNumbers);
	}
}
