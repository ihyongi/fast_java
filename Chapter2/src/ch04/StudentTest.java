package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		//인스턴스생성 new(동적메모리 heap에 할당이 된다--jvm가상메모리)->값셋팅
		//참조변수..!studentLee와 Kim은 Stack에 저장
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
		/*
		 * 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
		    클래스 : 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태
		    인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
		    멤버 변수 : 클래스의 속성, 특성
		    메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
		    참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
		    참조 값 : 생성된 인스턴스의 메모리 주소 값

		 */
		

	}

}
