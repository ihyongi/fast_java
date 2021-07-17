package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c3 =  Class.forName("java.lang.String"); //자바랭 관련 메서드들 쫙
		
		Constructor<String>[] cons =  c3.getConstructors(); //반환은 배열로
		for(Constructor con: cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = c3.getMethods();
		for(Method  method : methods) {
			System.out.println(method);
		}

	}

}
