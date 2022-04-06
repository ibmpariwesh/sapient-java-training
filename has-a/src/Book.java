import java.util.List;

public class Book {
	//Has-A relationship
//	private Author author;
	private List<Author> authors;

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
}
