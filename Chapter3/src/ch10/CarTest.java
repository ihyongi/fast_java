package ch10;

public class CarTest {

	public static void main(String[] args) {

		/*
		 * final 예약어 -재정의하면 안되는 것은
			final 변수 : 값이 변경될 수 없는 상수
			public static final double PI = 3.14;
			final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드
			final 클래스 : 상속할 수 없는 클래스
		 */
		
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("=================");
		Car manualCar = new ManualCar();
		manualCar.run();

	}

}
