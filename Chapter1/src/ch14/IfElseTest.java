package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		//int age = 7;

		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해주세요:");
		int age = scanner.nextInt();
		
		if( age >= 8) {
			System.out.println("학교에 다닙니다");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}

	}

}
