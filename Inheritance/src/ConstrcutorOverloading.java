
public enum STATUS {
	ISSUED, AVAILABLE, DAMAGED
}

class Book {
	private String title;
	private float price; // 4 bytes
	private STATUS status; // ISSUED, AVAILABLE, DAMAGED

	public Book(String title, float price, STATUS status) {
		this(title, price);
		this.status = status;
	}

	public Book(String title, float price) {
		this.title = title;
		this.price = price;
	}

}

public class ConstrcutorOverloading {

}
