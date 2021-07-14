package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		/*
		 * switch - case문
			if - else if - else 문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현
			비교 조건이 특정 값이나 문자열인 경우 사용
			break 문을 사용하여 각 조건이 만족되면 switch 블럭을 빠져나오도록 함
			자바 14부터 좀 더 간결해진 표현식이 지원 됨 ( break 사용하지 않음 )
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력해주세요:");
		int month = scanner.nextInt();
		//int month = 10;
		int day;
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break; //빠져나갈 break필요
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2: 
				day = 28;
				break;
			default:
				day = 0;
				System.out.println("존재하지 않는 달 입니다.");
			
		}
		System.out.println(month + "월은 " + day + "일입니다.");
	}

}
