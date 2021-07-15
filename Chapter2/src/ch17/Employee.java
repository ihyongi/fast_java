package ch17;

public class Employee {

	
	/*
	 * static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다
		static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있음
		인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
	 */
	
	private static int serialNum = 1000;

	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}
	
}
