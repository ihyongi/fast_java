package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee; //주소값 복사
		Student Shun = new Student(100, "Lee");
		
		System.out.println(Lee == Shun); //false
		System.out.println(Lee.equals(Shun)); //주소값이 같냐
		
		System.out.println(Lee.hashCode()); //주소값
		System.out.println(Shun.hashCode()); //주소값
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2)); //true
		System.out.println(i1.hashCode()); //100
		System.out.println(i2.hashCode()); //100
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		//추가
		Student Lee3 = (Student)Lee.clone(); //인스턴스의 상태를 고대로 복사
		System.out.println(System.identityHashCode(Lee));
		System.out.println(System.identityHashCode(Lee3));


		 
	}

}
