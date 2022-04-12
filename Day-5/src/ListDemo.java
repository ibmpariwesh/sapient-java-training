import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ram");
//		names.add(new Integer(1)); //type safety
		names.add("John");
		System.out.println(names);
//		names.remove(1);//removes john
//		names.remove(2);//error
		System.out.println(names);
		names.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("sorted="+names);
	}
}
