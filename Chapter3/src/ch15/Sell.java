package ch15;

public interface Sell {

	void sell();
	
	//디폴트 메서드가 중복 되는 경우
	//구현 코드를 가지고 인스턴스 생성된 경우만 호출되는 디폴트 메서드의 경우 두 개의 인터페이스에서 중복되면 구현하는 클래스에서 반드시 재정의를 해야 함
	
	default void order() {
		System.out.println("판매 주문");
	}

}
