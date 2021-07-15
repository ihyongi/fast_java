package ch03;

public class FunctionTest {

	/*
	 * 메서드- 클래스 내부에서
	 * 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
		멤버 함수 (member function)이라고도 함
		메서드를 구현함으로써 객체의 기능이 구현 됨
		메서드의 이름은 그 객체를 사용하는 객체(클라이언트)에 맞게 짓는것이 좋음
		예) getStudentName()
	 */
	
	public static int addNum(int num1, int num2) {
		int result;
		result=num1+num2;
		
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}

	public static int calcSum() {	
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}

	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		sayHello("안녕하세요");
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);

	}

}
