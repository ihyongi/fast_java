package ch19;

public class CarFactory {

	
	//1.생성자는 private로
	private CarFactory() {
		
	}
	
	//2.인스턴스 새로운 객체생성
	private static CarFactory instance = new CarFactory();
	
	
	//3.외부에서 사용가능하게하는 메서드제공
	public static CarFactory getInstance() {
		if(instance==null) {
			instance=new CarFactory();
		}
		return instance;
	}
	
	//4.여기서 new하니까 10001,10002
	public Car createCar() {
		Car car=new Car();
		return car;
	}


}
