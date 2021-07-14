package ch10;

public class ConstantTest {

	public static void main(String[] args) {

		/*
		 * 상수는 변하지 않는 수, 대문자로 표현
			원주률 3.14, 1년 12개월 등
			final 예약어를 사용하여 선언
			상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고
			혹, 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없음
		 */
		
		final int Max_Num=100;
		final int Min_Num;
		
		Min_Num=0;
		
		System.out.println(Max_Num);
		System.out.println(Min_Num);
	}

}
