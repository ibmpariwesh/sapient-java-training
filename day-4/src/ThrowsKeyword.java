import java.io.File;

public class ThrowsKeyword {
	
	public static void main(String[] args) {
		try {
			readFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void readFile() throws InterruptedException {
		Thread.sleep(1000);
	}
}
