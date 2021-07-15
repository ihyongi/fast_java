package ch19;

public class Car {
	/*
	 * 자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때마다 고유의 번호가 부여됩니다. 
		자동차 번호가 10001부터 시작되어 자동차가 생산될 때마다 10002, 10003 이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 구현하세요
		다음 CarFactoryTest.java 테스트 코드가 수행 되도록 합니다

	 */
	
	private static int serialNum=10000; //기준값
	private int carNum;
	
	public Car() {
		serialNum++; //공장제조번호
		carNum=serialNum; //차량번호부여
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	

}
