package ch09;

public class LocalVariableType {

	public static void main(String[] args) {

		/* 자바10에서 지원됨 --지역 변수 자료형 없이 사용하기
		 * Local variable type inference
			추론 가능한 변수에 대한 자료형을 선언하지 않음
			한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
			지역 변수만 사용 가능
		 */
		var i = 10; //int
		var j = 10.0; //double
		var str = "hello"; //String
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; //아래에서 바꿔도 위에꺼
		//str = 3; String에서 int로 바꾼다? no

		
	}

}
