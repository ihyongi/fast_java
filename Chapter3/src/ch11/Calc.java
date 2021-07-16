package ch11;

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

}
