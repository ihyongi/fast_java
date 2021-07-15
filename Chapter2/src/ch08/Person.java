package ch08;

public class Person {
	
	public String name;
	public int age;
	public int height;
	public int weight;
	public String gender;
	
	public Person(String name, int age, int height, int weight, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	public void showPersonDetail() {
		System.out.println("키가 " + height + "이고, 몸무게가 " + weight + "킬로인 "+ gender + "이 있습니다.");
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "세입니다" );
	}
	
	
}
