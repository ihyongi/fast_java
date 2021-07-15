package ch21;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];//여기에 복사하자
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		
		//복사
		//주소도 같다
		System.arraycopy(library, 0, copyLibaray, 0, 5);
		
		System.out.println("======copy library=========");
		for( Book book : copyLibaray ) {
			book.showBookInfo();
		}
		
		
		//책을변경하는 경우?
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		System.out.println("======library=========");
		for( Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("======copy library=========");
		for( Book book : copyLibaray) {
			book.showBookInfo();
		}

	}

}
