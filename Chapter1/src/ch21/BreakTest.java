package ch21;

public class BreakTest {

	public static void main(String[] args) {

		/*
		 * break문 사용하기
			감싸고 있는 제어문의 블록을 빠져 나오는 기능 (switch문 에서도 사용)
			반복문에서는 주로 조건문(if)와 같이 사용하여 조건에 해당되는 경우 반복 수행을 멈추고 반복문 외부로 수행이 이동
			여러 반복문이 중첩되어 있는 경우엔 break 문이 포함되어 있는 반복문만 빠져 나옴
			
			1부터 숫자를 더하여 100이 넘는 순간의 그 숫자와 합을 출력하세요
		 */
		
		int sum = 0;
		int num;
		for( num = 1; ; num++) {
			sum += num;
			if( sum >= 100) {
				break;
			}
		}
		
		System.out.println(sum); //105
		System.out.println(num); //14

	}

}
