import java.io.IOException;

public class ThrowKeyword {

	public static void main(String[] args) {
		try {
			m1();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void m1() throws IOException {
		readFile("");
	}

	private static void readFile(String file) throws IOException {
		if (file.equals(""))
			throw new IOException();
		System.out.println();
	}
}
