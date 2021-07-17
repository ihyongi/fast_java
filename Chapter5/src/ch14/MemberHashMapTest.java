package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();

		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(1001, "kim");
		hashMap.put(1002, "lee");
		hashMap.put(1003, "park");
		hashMap.put(1004, "hong");
		
		System.out.println(hashMap); //{1001=kim, 1002=lee, 1003=park, 1004=hong}

		
		//hashmap+treeset =TreeMap
		/*
		 * Map 인터페이스를 구현한 클래스이고 key에 대한 정렬을 구현할 수 있음
			key가 되는 클래스에 Comparable이나 Comparator인터페이스를 구현함으로써 
			key-value 쌍의 자료를 key값 기준으로 정렬하여 관리 할 수 있음
		 */
	}

}
