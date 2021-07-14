package ch06;

public class VariableTest {

	public static void main(String[] args) {

		byte bnum=-128;
		System.out.println(bnum);
		
		byte cnum= 127; //128은 범위초과 못씀(127까지 가능)
		System.out.println(cnum);
		
		//int num=12345678900; //범위초과
		//long num=12345678900; //long형인데 왤까
		long num=12345678900L; //L식별자 필요 good
		
		
	}

}
