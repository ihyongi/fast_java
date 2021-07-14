package ch15;

import java.util.Scanner;

public class IfElseIfElseTest {

	public static void main(String[] args) {

		//int age = 12;
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해주세요:");
		int age = scanner.nextInt();
	   	int charge;
	   	
	   	//하나의 조건
	   	if(age < 8){
	   		charge = 1000; 
	   		System.out.println("미 취학 아동입니다.");
	   	}
	   	else if(age < 14){ //상호배타적으로 조건문을 짜야한다
	   		charge = 2000;
	   		System.out.println("초등학생 입니다.");
	   	}
	   	else if(age < 20){
	   		charge = 2500;
	   		System.out.println("중, 고등학생 입니다.");
	   	}
	   	else{ //default
	   		charge = 3000;
	   		System.out.println("일반인 입니다.");
	   	} 
	   	
	   	System.out.println("입장료는 " + charge + "원입니다.");

	}

}
