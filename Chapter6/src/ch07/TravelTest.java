package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		/*
		 * 고객의 명단을 출력합니다.
			여행의 총 비용을 계산합니다.
			고객 중 20세 이상인 사람의 이름을 정렬하여 출력합니다.
		 */
		
		//고객3명
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		//고객리스트에 넣기
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));//이름만 호출해서 순서대로 뽑았다
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();//총금액
		System.out.println("총 여행 비용은 :" + total + "입니다"); 
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		//골라야되면->filter 정렬->sorted
	}

}
