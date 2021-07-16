package ch09;

public abstract class Computer {

	/*
	 * 추상 클래스란? 껍데기만 재정의필요
		구현 코드 없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스
		메서드 선언(declaration) : 반환타입, 메서드 이름, 매개변수로 구성
		메서드 정의(definition) : 메서드 구현(implementation)과 동일한 의미 구현부(body) 를 가짐 ({ })
		예) int add(int x, int y); // 선언 
		   int add(int x, int y){ } // 구현부가 있음, 추상 메서드 아님
		abstract 예약어를 사용
		추상 클래스는 new 할 수 없음 ( 인스턴스화 할 수 없음 )
	 */
	
	abstract void display(); //추상메서드 --공통으로 쓸 메서드.. 하위클래스에게 책임을 위임한다(구체적으로 써라)
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	
}
