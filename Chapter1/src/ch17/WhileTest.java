package ch17;

public class WhileTest {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0; //지역변수는 자동으로 초기화가 되지않기때문에 0을 써줘야됌!!!
		
		while( num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println(sum); //55
		System.out.println(num); //11

	}

}
