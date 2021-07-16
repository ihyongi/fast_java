package ch09;

public abstract class NoteBook extends Computer{

	@Override
	public void typing() {
		System.out.println("NoteBook typing");		
	}
	
	//나머지 오버라이드 메서드 선언 안하겠다 ->abstract로 선언

}
