import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
//		arrayOfNumbers();
		arrayofObjects();
	}

	private static void arrayofObjects() {
//		String[] names = new String[10];
		String[] names = new String[]{"Ram", "John"};
		System.out.println(names.length);
//		names[2]="Tom";//error
		System.out.println(names[1]);
		names[1]="Tom";
		System.out.println(names[1]);
	}

	private static void arrayOfNumbers() {
		int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[9] = 9;
		System.out.println(Arrays.toString(numbers));
	}
}
