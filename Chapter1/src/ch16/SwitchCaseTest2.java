package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.print("메달을 영어로 입력해주세요:");
		String medal=scanner.nextLine();
		//String medal = "Gold";
		
		switch(medal) {
			case "gold":
				System.out.println("금메달 입니다.");
				break;
			case "silver":
				System.out.println("은메달 입니다.");
				break;
			case "bronze":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
		}

	}

}
