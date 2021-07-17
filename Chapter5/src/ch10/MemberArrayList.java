package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	// 순차적으로 자료를 관리하는 List
	
	private ArrayList<Member> arrayList;  // ArrayList 선언 --회원목록관리하는데 good

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member){  //ArrayList 에 멤버 추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		
		/*
		 * for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
		 * Member member = arrayList.get(i); int tempId = member.getMemberId();
		 * if(tempId == memberId){ // 멤버아이디가 매개변수와 일치하면 arrayList.remove(i); // 해당 멤버를
		 * 삭제 return true; // true 반환 } }
		 * 
		 * System.out.println(memberId + "가 존재하지 않습니다"); //for 가 끝날때 까지 return 이 안된경우
		 * return false;
		 */          
		
		/*
		 * 요소의 순회란?
			컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것
			순서가 있는 List인터페이스의 경우는 Iterator를 사용 하지 않고 get(i) 메서드를 활용할 수 있음
			Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함
		 */
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) { //false나오면 나와
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false;      

	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}


}
