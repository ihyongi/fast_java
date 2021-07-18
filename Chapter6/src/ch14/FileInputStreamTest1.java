package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null; //기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
		
		try {
			fis = new FileInputStream("input.txt");
		
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
		
		} catch (IOException e) {
			System.out.println(e);
			
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e){
				System.out.println(e);
			}
		}
		System.out.println("end");

	}

}
