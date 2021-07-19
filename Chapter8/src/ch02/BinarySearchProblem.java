package ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {

		/*
		 * '수수의 위치' --이진탐색
			정의
			많은 사람들이 모여들었습니다
			도리어 낱낱이 좋은 소리를 내고 있다.
			이에 따라 이진 검색(binary search)이 실행되고 있기도 하면 이번 실적이 달성될 것으로 예상된다.
			수의 예 : [12, 25, 31, 48, 54, 66, 70, 83, 95, 108] :**정렬** ->중간을가서 판단..범위조정
			83의 위치 찾아보기
			88의 위치를 ​​찾아 소개합니다
		 */
		
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		 
		int left = 0; //1
		int right = numbers.length-1; //10
		int mid = (left + right)/2; //5

		int temp=numbers[mid]; //54 //66 //70 //83
		boolean find =false; 
		
		while(left<=right) {
			if(target==temp) {
				find=true;
				break;
			}else if(target<temp) {
				right=mid-1;
			}else {
				left=mid+1; //6 //7 //8
			}
			
			mid=(left+right)/2;
			temp=numbers[mid];
		}
		
		if(find == true) { //numbers[mid]==83
			mid++;
			System.out.println("찾는 수는 " + mid + "번째 있습니다.");
		}else {
			System.out.println("찾는 수가 없습니다.");
		}

	}

}
