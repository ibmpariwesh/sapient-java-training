import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("Ram", 90); // entry = key-value pair, auto boxing
		marks.put("john", new Integer(80));
		System.out.println(marks);
//		auto unboxing
		int ramMarks = marks.get("Ram");//auto unboxing
		marks.remove("Ram");
		System.out.println(marks);
	}
}
