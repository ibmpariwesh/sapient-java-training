
public class MultipleCatchBlocks {
	static String name; // only reference

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
			name.chars();// exception will be thrown here
			System.out.println("1");
		} catch (NullPointerException nullPointerException) {
			nullPointerException.printStackTrace();
			System.out.println("NPE");
		} catch (Exception exception) {
			System.out.println("exception");
		}
		finally {
			System.out.println("always called");
		}
	}

}
