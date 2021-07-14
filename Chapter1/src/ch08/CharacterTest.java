package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A'; //""이거랑은 또 다르다.. ""는 String에서
		System.out.println(ch1);
		System.out.println((int)ch1); //A의 아스키값은 65
		
		char ch2 = 66; //B
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3); //67
		System.out.println((char)ch3); //C
		
		//char ch4 = -66;  음수는 대입 할 수 없음
		//char는 2바이트 내부적으로 정수값을 가지고있다(음수X)

    	char ch5 = '한';
		char ch6 = '\uD55C'; //유니코드 쓸때는 '/u' 
		
		System.out.println(ch5);
		System.out.println(ch6); //한
		
		/*
		 * 	character set: 문자를 숫자로 변환한 값의 세트
			encoding: 문자가 숫자로 변환되는 것
			decoding: 숫자에서 다시 문자로 변환되는 것
			ASKII code: 알파벳과 숫자 특수 문자등을 1바이트에 표현하는데 사용하는 문자세트
			UNICODE: 전 세계 표준으로 만든 문자 세트
			UTF-8: 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음
			UTF-16: 2바이트로 문자를 표현

		 */
	}

	}


