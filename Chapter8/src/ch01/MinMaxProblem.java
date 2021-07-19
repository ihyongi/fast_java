package ch01;

public class MinMaxProblem {

	public static void main(String[] args) {

		/*
		 * 많은 양의 가장 큰 값을 차지했습니다.
			순서가 몇 개인지.
			단 한번만 연락해 주세요.
			수의 예 : [10, 55, 23, 2, 79, 101, 16, 82, 30, 45]
		 */
		
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		int min = numbers[0]; //첫번째 값
		int max = numbers[0]; //첫번째 값
		
		int minPos = 0;
		int maxPos = 0;
		
		for(int i=1; i<numbers.length;i++) {
			if(min >numbers[i]) {
				min=numbers[i];
				minPos =i+1; //순서
			}
			if(max <numbers[i]) {
				max=numbers[i];
				maxPos =i+1; //순서
			}
		}
		
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다."); //가장 큰 값은 101이고, 위치는 6번째 입니다.
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다."); //가장 작은 값은 2이고, 위치는 4번째 입니다.

	}

}
