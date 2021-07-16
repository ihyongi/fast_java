package ch11;

public abstract class Calculator implements Calc{

	
	//여기서 일부구현
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
