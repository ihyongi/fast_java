package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

		//조건연산자.. 삼항
		//조건식?결과1:결과2;
		
		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n ");
		
		Scanner scanner = new Scanner(System.in); //System.in 표준입력
		System.out.println("입력1:");
		int x = scanner.nextInt(); //입력받을 수 있다
		System.out.println("입력2:");
		int y = scanner.nextInt();
		
		max = (x > y)? x : y; //조건연산자
		System.out.println(max);
		
	}

}
