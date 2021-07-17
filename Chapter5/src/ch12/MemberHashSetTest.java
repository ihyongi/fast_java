package ch12;

import ch10.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMember();
		
		//같은놈이다 정의를 안해줘서!!!! equals, hashcode구현 필요!!<Member>
		Member memberHong = new Member(1003, "홍길동");  //1003 아이디 중복 왜들어가누....
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();

	}

}
