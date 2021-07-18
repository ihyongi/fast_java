package ch04;

public class TestStringConcat {

	public static void main(String[] args) {

		//람다식이전 일반
		StringConCatImpl concat1 = new StringConCatImpl();
		String s1 = "Hello";
		String s2 = "World";
		concat1.makeString(s1, s2);
		
		//람다식--내부적으로 익명클래스로
		StringConcat concat=(s,v)->System.out.println(s+","+v);
		concat.makeString(s1, s2);
		
		
//		StringConcat concat3 = new StringConcat() {
//			@Override
//			public void makeString(String s1, String s2) {
//					
//				System.out.println( s1 + "," + s2 );
//			}
//		};
//				
//		concat3.makeString(s1, s2);

	}

}
