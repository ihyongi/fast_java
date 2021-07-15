package ch12;

public class Person {

	/*
	 * this가 하는 일
		인스턴스 자신의 메모리를 가리킴
		생성자에서 또 다른 생성자를 호출 할때 사용
		자신의 주소(참조값)을 반환 함
	 * 
	 * 생성자에서 다른 생성자를 호출 하는 this
		클래스에 생성자가 여러 개 인경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
		생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없음
	 */
	
	String name;
	int age;

	public Person() {
		this("이름없음",1);
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "James";
		p.age = 37;
		
		Person p2 = p.getPerson(); //자신의 주소를 반환
		System.out.println(p); //ch12.Person@7d6f77cc
		System.out.println(p2); //ch12.Person@7d6f77cc
	}
	
	/*
	 * 객체 지향 프로그래밍에서의 협력
		객체 지향 프로그램에서 객체 간에는 협력이 이루어짐
		협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야 함
		매개 변수로 객체가 전달되는 경우가 발생
	 */

}
