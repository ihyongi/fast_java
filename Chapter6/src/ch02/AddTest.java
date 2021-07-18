package ch02;

public class AddTest{
	
	public static void main(String[] args) {
		
		//람다식(인터페이스선언하고 구현을 그때그때 바로)
		//리턴지우고 , 중괄호 지우고 사용가능
		Add add = (x,y)->x+y;
		System.out.println(add.add(2, 3));
	}


}
