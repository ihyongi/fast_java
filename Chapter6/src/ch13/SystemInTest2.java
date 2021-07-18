package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		/*
		 * InputStream
			바이트 단위 입력 스트림 최상위 추상 클래스
			많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현함
		 */
		
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			InputStreamReader irs=new InputStreamReader(System.in); //바이트단위--보조스트림
			while( (i = irs.read()) != '\n' ) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	}

