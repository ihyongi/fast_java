package ch12;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		/*
		 * HashSet 클래스
			Set 인터페이스를 구현한 클래스와
			멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야 함
			동일성 구현을 위해 필요에 따라 equals()와 hashCode()메서드를 재정의함
			
			중복되지 않게 자료를 관리하는 Set 인터페이스
		 */

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("김유신"));
		hashSet.add(new String("이순신"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬")); //중복허용을안하기때문에 하나만 들어가는데 전꺼냐 뒤꺼냐
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);//여기서는 toString이 호출
		

	}

}
