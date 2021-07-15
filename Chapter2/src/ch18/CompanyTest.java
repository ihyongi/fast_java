package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance(); //인스턴스를 만들지않음.. static, newX
		Company company2 = Company.getInstance();
		
		System.out.println(company1); //ch18.Company@5aaa6d82
		System.out.println(company2); //ch18.Company@5aaa6d82
		
		//Calendar calendar = Calendar.getInstance(); //new하면 안됨

	}

}
