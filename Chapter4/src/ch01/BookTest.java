package ch01;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;	
	}

}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("박맹이", "뿅망치");
		System.out.println(book);

		String str=new String("test");
		System.out.println(str.toString()); //객체의 대한 정보 toString

	}

}
