package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {

		/*
		 * Java 14 부터 지원 되는 Switch Expression
			간단하게 쉼표(,)로 조건 구분
			식으로 표현 하여 반환 값을 받을 수 있음. 리턴 값이 없는 경우는 오류가 생김
			yield 키워드 사용(return대신에)
		 
		
		int month = 3;
		int day = switch (month) {
	    	case 1, 3, 5, 7, 8, 10,12 -> {
	    		System.out.println("한 달은 31일입니다."); 
	    		yield 31;
	    	}
	    	case 4,6,9,11 -> {
	    		System.out.println("한 달은 30일입니다."); 
	    		yield 30;
	    	}
	    	case 2 ->{
	    		System.out.println("한 달은 28일입니다.");
	    		yield 28;
	    	}
	    	default->{
	    		System.out.println("존재하지 않는 달 입니다."); 
	    		yield 0;
	    	}
		};
		
		System.out.println(month + "월은 " + day + "일입니다.");
*/
	}
	

}
