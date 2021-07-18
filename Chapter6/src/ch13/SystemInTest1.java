package ch13;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
		while((i = System.in.read()) != '\n'){ //1바이트를 읽고 출력 ->A:65 인티져값을 가져옴
			//System.out.println(i);
			System.out.print((char)i);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
