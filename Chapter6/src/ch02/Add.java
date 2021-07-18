package ch02;

@FunctionalInterface //얘가 뭐하는애다.. 알려주는기능, 오류방지->메서드를 두개이상 선언하면 안됨
public interface Add {
	public int add(int x, int y);
	//public int sub(int x, int y);
	
}
