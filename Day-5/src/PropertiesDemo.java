import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties marks = new Properties();//key will always be a string
		marks.put("Ram", 90); // entry = key-value pair, auto boxing
		marks.put("john", 80);
		System.out.println(marks);
//		auto unboxing
		int ramMarks = (int) marks.get("Ram");//auto unboxing
		marks.remove("Ram");
		System.out.println(marks);
	}
}
