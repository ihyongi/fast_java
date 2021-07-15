package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		/*
		 * 앞의 예제에서 Edward는 지각을 해서 택시를 타야 했습니다. 
			20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
			택시는 '잘나간다 운수' 회사 택시를 탔습니다.
		 */
		
		Person person=new Person("Edward", 20000);
		Taxi taxi=new Taxi("잘나간다 운수");
		
		person.take(taxi);
		person.showInfo();
		taxi.showTaxiInfo();
		
	}

}
