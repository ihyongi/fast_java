package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class BufferedStreamTest {

	public static void main(String[] args) throws IOException {

		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("a.zip"); //바이트
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis); //String으로 감싸줘->엄청빠르다
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
		
			millisecond = System.currentTimeMillis(); //현재시간
			
			int i;
			while( ( i = bis.read()) != -1){
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond; //소요시간
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
		
		Socket socket=new Socket();
		BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
		br.readLine();
	}

}
