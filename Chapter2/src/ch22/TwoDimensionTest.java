package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {

		/*
		 * 다차원 배열
			이차원 이상으로 구현 된 배열
			평면 (이차원 배열) 이나 공간(삼차원 배열)을 활용한 프로그램 구현
			int[][] arr = {{1,2,3}, {4,5,6}}
		 */
		
		int[][] arr = { {1,2,3}, {4,5,6,7}};
		int i, j;
		
		for(i =0; i<arr.length; i++) { //행을 기준으로 열을 돌린다
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(", \t" + arr[i].length);
			System.out.println();
		}

	}

}
