package ch18;

public class Company {

	/*
	 * 싱글톤 패턴이란?
		프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
		static 변수, 메서드를 활용하여 구현 할 수 있음
		
		싱글톤 패턴으로 회사 객체 구현하기 --유일해야한다
	 */
	
	
	//1.생성자 private로
	private Company() {
		
	}
	
	//2.인스턴스생성 --유일한 객체
	private static Company instance = new Company();
	
	
	//3.접근허용하게하기위한 getInstance --static으로 외부에서 클래스로 가져옴
	public static Company getInstance() {
		if( instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
	
	

}
