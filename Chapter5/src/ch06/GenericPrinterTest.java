package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		//Powder powder=new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //다이아몬드 연산자
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
		
		//Plastic plastic=new Plastic();
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);


		/*
		 * 제네릭에서 자료형 추론(자바 10부터)
			ArrayList list = new ArrayList()  => var list = new ArrayList();
			타입을 지정하지않으면 object로 반환
		 */
	}

}
