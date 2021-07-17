package ch10;

//Member클래스가 아이디 오름차순으로 정렬되게 하기 위해 Comparable 인터페이스를 구현
public class Member implements Comparable<Member> {

	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름

	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	
	//너랑나는 같은놈이다 중복은 안된다-----HashSet
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member){ //이게 같냐?
			Member member = (Member)obj;
			if( this.memberId == member.memberId )
				return true;
			else 
				return false;
		}
		return false; //같으면 안되는거여

	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

	//정렬--비교를 어떻게할 것인가 , 콜백펑션
	@Override
	public int compareTo(Member member) {
		//return (this.memberId - member.memberId);   //오름차순
				return (this.memberId - member.memberId) *  (-1);   //내림 차순
				
				//나보다 크면 양수, 작으면 음수, 같으면 0

	}
	

}
