import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryDemo {
public static void main(String[] args) {
	Dictionary<String, Integer> marks = new Hashtable();
	marks.put("Ram", 90); // entry = key-value pair, auto boxing
	marks.put("john", new Integer(80));
	System.out.println(marks);
//	auto unboxing
	int ramMarks = marks.get("Ram");//auto unboxing
	marks.remove("Ram");
	System.out.println(marks);
}
}
