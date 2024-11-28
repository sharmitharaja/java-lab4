package BookDetails;
import java.util.ArrayList;
class Book{
	private int BookId;
	private String BookName;
	private String AuthorName;
	// parameterized constructor
	public Book(int BookId,String BookName,String AuthorName) {
		this.BookId=BookId;
		this.BookName=BookName;
		this.AuthorName=AuthorName;
	}
	//method to display bookdetails
	public void displayBookdetails() {
		System.out.println("BookId:"+BookId);
		System.out.println("BookName:"+BookName);
		System.out.println("AuthorName:"+AuthorName);
		System.out.println("-----------------");
	}
}

public class BookCollection {

	public static void main(String[] args) {
		//create an ArrayList of type Book
		ArrayList<Book>booklist=new ArrayList<>();
		//Adding books to the collection
		booklist.add(new Book(1,"To kill a Mockingbird","Harper Lee"));
		booklist.add(new Book(2,"1984","George Orwell"));
		booklist.add(new Book(3,"The Great Gatsby","F.Scott Fitzgerald"));
		//Display all book details using an advanced for loop
		System.out.println("Displaying all book Details");
		for(Book book:booklist) {
			book.displayBookdetails();
		}
	}

}
