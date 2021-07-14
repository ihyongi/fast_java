package ch18;

import java.util.Scanner;

public class DowhileTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input; 
		int sum = 0;

		do {
			input = scanner.nextInt();
			sum += input;
		}while(input != 0); //조건문이 발현되는 시점? 수행문do문이 한번은실행되고 나서 ->

 
		System.out.println(sum);

	}

}
