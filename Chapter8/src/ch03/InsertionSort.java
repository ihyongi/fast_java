package ch03;

public class InsertionSort {


		/*
		 * 삽입정렬 구현해보기
			Insertion Sort의 기본 개념은 이미 여기에 포함된 제품에 대한 추가적 사고로 인해 추가되는 개념입니다.(손안의 카드)
			두텁게 개선된 광고 광고 '광고' 기능을 개선하는 데 도움이 될 것입니다.
					 */
	
	public static void insertionSort(int[] arr, int count) {
		int i = 0, j = 0;
		int temp = 0; //얘를 어디에다가 넣을 건지?

		for(i = 1; i < count; i++) {
			temp = arr[i];
			j = i;
			while((j > 0) && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j = j - 1;
			}
			arr[j] = temp;

			System.out.println("반복 -" + i);
			printSort(arr, count);
		}
		
	}
	
	
	public static void printSort(int value[], int count) {
		int i = 0;
		for(i = 0; i < count; i++) {
			System.out.print(value[i] + "\t");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[] arr = {80, 50, 70, 10, 60, 20, 40, 30 };
		insertionSort(arr, 8);

		
	}

}
