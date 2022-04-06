
public class Book {
	private String title;
	private float price; // 4 bytes
	private STATUS status; // ISSUED, AVAILABLE, DAMAGED

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
}
