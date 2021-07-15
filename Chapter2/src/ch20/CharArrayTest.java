package ch20;

public class CharArrayTest {

	 public static void main(String[] args) {
	      /*int[] arr = new int[10];
	      int total = 0;
	      
	      for(int i =0, num=1; i<arr.length; i++) {
	         arr[i] = num++;
	      }
	      for( int num : arr) {
	         total += num;
	      }
	      System.out.println(total);
	   }*/

		 
		//문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기
	 
	 	char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpahbets.length; i++) {
			
			alpahbets[i] = ch++;
		}
		
		for(int i = 0; i<alpahbets.length; i++) {
			System.out.println(alpahbets[i] +","+ (int)alpahbets[i]);
		}


	 }
}
