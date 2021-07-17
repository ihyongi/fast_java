package ch03;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc"); //힙에 메모리가 잡힘!!!
		String str2 = "abc";
		
		System.out.println(str1 == str2);
		
		String str3 = "abc"; //상수풀
		String str4 = "abc";
		
		System.out.println(str3 == str4);


	}

}
