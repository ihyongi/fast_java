package ch19;

public class ForTest {

	public static void main(String[] args) {

		//1부터 10까지 더한 결과를 출력하세요
		int count =1;
		int sum = 0;
		
		for( int i = 0 ; i<10; i++, count++) {  //10번
			sum += count;
			//count++;
		}
		System.out.println(sum); //55
		
		
		//while ver.
		int num = 1;
		int total = 0;
		
		while( num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total); //55

	}

}
