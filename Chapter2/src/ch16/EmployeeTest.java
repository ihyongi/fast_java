package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		//static 변수는 인스턴스에서 공통으로 사용하는 영역임음 알 수 있음 ..데이터영역..?
		//static 변수와 메서드는 인스턴스 변수, 메서드가 아니므로 **클래스 이름으로 직접 참조**
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		//System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		//employeeKim.serialNum++;
		
		/*
		 * System.out.println(employeeLee.serialNum);
		 * System.out.println(employeeKim.serialNum);
		 */

		System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());

		
	}

}
