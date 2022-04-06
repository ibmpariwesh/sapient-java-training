import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Book book = new Book();
		List<Author> authors = new ArrayList<>();
		Author a1 = new Author();
		a1.setName("Ram");
		authors.add(a1);
		
		Author a2 = new Author();
		a2.setName("Trehan");
		authors.add(a2);
		
		book.setAuthors(authors);
	}
}
