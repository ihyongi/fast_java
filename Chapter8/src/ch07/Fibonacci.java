package ch07;

public class Fibonacci {

		int[] value;
		int number;
		
		public Fibonacci(int number) {
			this.number = number;
			value = new int[number];
		}
		
		//1.재귀 --가장 직관적
		public int fibonacciRecur(int n) {

			if (n == 0) return 0;
			if (n == 1) return 1; //리커시브함수 구현시 중요..? terminate condition을 확인!!

			return fibonacciRecur(n - 1) + fibonacciRecur(n - 2); //재귀함수.. 불리고 또 불리고
		}
		
		//2.for문
		public int fibonacciIter(int n) {
			
			int ppre = 0;
			int pre = 1;
			int current = 0;

			if (n == 0) return 0;
			if (n == 1) return 1;

			for (int i = 2; i <= n; i++) {
				
				current = ppre + pre;
				ppre = pre;
				pre = current;	
			}

			return current;
		}
		
		//3.저장?
		public int fibonacciMem(int n) {
			
			value[0] = 0;
			value[1] = 1;
			int result = 0;
			
			if (n == 0) {
				return value[0];
			}
				
			if (n == 1) {
				return value[1];
			}
			
			for(int i = 2; i<=n; i++) {
				
				result = value[i-1] + value[i-2];
				
				if(value[i] == 0) {
					value[i] = result;
				}

			}
			
			return result;
		}
		
	
	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci(100);
		
		int result = fib.fibonacciRecur(10);
		System.out.println(result);
		
		result = fib.fibonacciIter(10);
		System.out.println(result);
		
		result = fib.fibonacciMem(10);
		System.out.println(result);
	}

}
