package ch04;

public class Customer {
	
	/*
	 * 하위 클래스에서 메서드 재정의 하기
		오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
		하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음
		VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음
		재정의 하여 구현해야 함
	 */

	
	protected int customerID; //하위클래스에서는 접근 가능
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	
	 public Customer() {
	 customerGrade = "SILVER"; bonusRatio = 0.01;
	 System.out.println("Customer() call");
	 
	 }
	 
	
	public Customer(int customerId, String customerName) {
		this.customerID=customerId;
		this.customerName=customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int,String) call");
		
	}
	
	public int calcPrice(int price) {
		bonusPoint+= price* bonusRatio;
		return price;
	}
	
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는" + bonusPoint + "입니다";
		
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	

}
