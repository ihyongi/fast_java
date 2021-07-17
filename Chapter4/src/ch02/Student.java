package ch02;

public class Student implements Cloneable{

	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId+","+studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student std = (Student)obj; //형변환
			if(this.studentId == std.studentId )
				return true;
			else return false;
		}
		return false;

	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	
	}

}