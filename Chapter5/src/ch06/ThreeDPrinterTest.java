package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		Powder powder = new Powder();
		
		printer.setMaterial(powder);
		Powder p = (Powder)printer.getMaterial();

	}

}
