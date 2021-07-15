package ch20;

public class CharArray {

	/*
	 * 배열이란?
		동일한 자료형의 순차적 자료 구조
		인덱스 연산자[]를 이용하여 빠른 참조가 가능
		물리적 위치와 논리적 위치가 동일
		배열의 순서는 0부터 시작
		자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
	 */
	
	
	//배열 선언하기-- new
	int[] arr1 = new int[10];
	int arr2[] = new int[10];
	
	//아놔 이거 틀렸네 ㅋㅋ **바로 숫자 넣지않는다!!**
	int[] nums = new int[] {10, 20, 30};  //개수 생략해야 함
	int[] numbers = {10, 20, 30};            // new int[]  생략 가능 
	
	//int[] ids; 
	//ids = new int[] {10, 20, 30};            // 선언후 배열을 생성하는 경우는 new int[] 생략할 수 없음


}
