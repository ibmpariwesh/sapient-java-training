import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	public static void main(String[] args) {
		Map<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Ram", 90); // entry = key-value pair, auto boxing
		marks.put("john", new Integer(80));
		System.out.println(marks);
//		auto unboxing
		int ramMarks = marks.get("Ram");//auto unboxing
		marks.remove("Ram");
		System.out.println(marks);
	}
}
