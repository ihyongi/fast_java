package ch04;

import java.lang.reflect.Constructor;

public class ClassTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, Exception  {

		//1.클래스가져오기 1번
		Class c1 = Class.forName("ch04.Person");
		Person person = (Person)c1.newInstance();
		

		person.setName("Lee");
		System.out.println(person);
		
		//2. getClass --이미 인스턴스가 있는상태
		Class c2 = person.getClass();
		Person person2 = (Person)c2.newInstance();
		System.out.println(person2);
		
		
		//3.로컬에 펄슨이 없을때 쓰는거.. 
		Class[] parameterTypes= {String.class};
		Constructor cons=c2.getConstructor(parameterTypes);
		
		Object[] initargs= {"Kim"};
		Person Kim=(Person)cons.newInstance(initargs);
		System.out.println(Kim);
	}

}
