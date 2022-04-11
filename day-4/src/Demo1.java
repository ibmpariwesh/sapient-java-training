
public class Demo1 {
	static String name; // only reference

	public static void main(String[] args) {
		try {
			name.chars();//exception will be thrown here
			System.out.println("1");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("catch");
		} finally {
			System.out.println("always called");
		}
	}
}
