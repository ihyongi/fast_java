package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		//학생, 가진돈
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		//버스
		Bus bus100 = new Bus(100);
		
		//지하철
		Subway subwayGreen = new Subway(2);
		
		//test
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		
		studentJ.showInfo();
		studentT.showInfo();
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();


	}

}
