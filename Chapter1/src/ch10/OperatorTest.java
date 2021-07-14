package ch10;

public class OperatorTest {

	public static void main(String[] args) {

		//연산자1
		
		int gameScore=150;
		//int lastScore=++gameScore; //끝나기전에 증가되거나 감소 gameScore+=1 이거랑 같음
		int lastScore=gameScore++; //statement가 끝날 때 증감
		
		//++이 언제 붙느냐가 관건
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
