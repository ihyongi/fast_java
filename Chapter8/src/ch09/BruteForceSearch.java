package ch09;

public class BruteForceSearch {

	public static void main(String[] args) {

		/*
		 * 완전탐색--모든 경우에 사용하는 결과를 찾는 것
			중요하게 처리해야 하고 모든 것을 처리해야 합니다.
			수열이나 같은 수학을 사용하세요.
		 * 
		 * 심각한 인플레이션을 겪고 있는 어느나라에서 1만원, 2만원, 5만원, 10만원 20만원 50만원 여섯가지 지폐를 사용하고 있다. 
			배고파씨는 100만원 어치 빵을 사려고 마트에 가서 돈을 내려다 여섯 가지 지폐를 이용하여 100만원 어치 빵을 사는 방법이 모두 몇 가지인지궁금해 졌다. 
			지불하는 방법은 모두 몇 가지가 있을까?
			예를 들어 1만원 10장, 10만원 4장, 50만원 1장 으로 100만원을 지불 할 수 있다.
			모두 몇가지인지 구하세요

		 */
		
		int[] bills = { 1, 2, 5, 10, 20, 50 };
		
		int count = 0;
		int money = 100;
		int i0, i1, i2, i3, i4;

		for (i0 = money; i0 >= 0; i0 -= bills[0]) {
			for (i1 = i0; i1 >= 0; i1 -= bills[1]) {
				for (i2 = i1; i2 >= 0; i2 -= bills[2]) {
					for (i3 = i2; i3 >= 0; i3 -= bills[3]) {
						for (i4 = i3; i4 >= 0; i4 -= bills[4])
							if (i4 % bills[5] == 0)
								count++;
					}
				}
			}
		}

		System.out.println("지불 가능한 가지 수는 : " +  count + "가지 입니다."); //4562

	}

}
