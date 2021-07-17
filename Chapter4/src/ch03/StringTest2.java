package ch03;

public class StringTest2 {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));//주소값 가져오기.. 2104457164
		
		java = java.concat(android);//연결
		
		System.out.println(java);//java+android
		System.out.println(System.identityHashCode(java));//1521118594 연결된 아웃풋은 주소가 다름


	}
}
