
public class Library {
	public static void main(String[] args) {
		Book b1 = new Book("learn java");
		b1.setPrice(100.3F);
		b1.setStatus(STATUS.AVAILABLE);
		System.out.println(b1.getTitle());
		System.out.println(b1.getPrice());
	}
}
