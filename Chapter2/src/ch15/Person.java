package ch15;

public class Person {

	String studentName;
	int money;
	
	public Person(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void take(Taxi taxi) {
		taxi.take(10000);
		this.money-=10000;
	}
	
	public void showInfo() {
		System.out.println(studentName +"님의 남은 돈은 " + money + "원 입니다");
	}
	
}
