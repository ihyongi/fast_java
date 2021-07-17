package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
//		TreeSet<String> set =new TreeSet<>();
//		set.add("홍길동");
//		set.add("강감찬");
//		set.add("이순신");
//		
//		System.out.println(set); //오름차순 [강감찬, 이순신, 홍길동] 기본 comparable
		
		
		/*
		 * MemberTreeSet memberTreeSet = new MemberTreeSet();
		 * 
		 * Member memberKim = new Member(1003, "김유신"); Member memberLee = new
		 * Member(1001, "이순신"); Member memberKang = new Member(1002, "강감찬");
		 * 
		 * memberTreeSet.addMember(memberKim); memberTreeSet.addMember(memberLee);
		 * memberTreeSet.addMember(memberKang); memberTreeSet.showAllMember();
		 */

		TreeSet<String> set =new TreeSet<String>();
		set.add("park");
		set.add("kim");
		set.add("lee");
		
		System.out.println(set); //[[kim, lee, park]]
	}

}
