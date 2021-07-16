package ch14;

public interface Calc {

	/*
	 * 모든 메서드가 추상 메서드로 선언됨 public abstract
		모든 변수는 상수로 선언됨 public static final
	 */
	
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}

	static int total(int[] arr) {
		int total = 0;
			
		for(int i: arr) {
			total += i;
		}
		mystaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private method");
	}
		
	private static void mystaticMethod() {
		System.out.println("private static method");
	}



}
