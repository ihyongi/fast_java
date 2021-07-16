package ch03;

public class VIPCustomer extends Customer{
	
	/*
	 * 매출에 더 많은 기여를 하는 단골 고객
		제품을 살때 10%를 할인해 줌
		보너스 포인트는 제품 가격의 5%를 적립해 줌
		담당 전문 상담원이 배정됨

	 */
	
	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		
		//super-하위클래스가 상위클래스의 인스턴스를 가질 수 있게한다 , 상위 디폴트생성자호출
		//super();
		super(0,"no name");
		
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() call");

	}
	
	public VIPCustomer(int customerId, String customerName) {
		
		//super-하위클래스가 상위클래스의 인스턴스를 가질 수 있게한다 , 상위 디폴트생성자호출
		//super();
		super(customerId,customerName);
		
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int,String) call");

		
	}
	
	public int getAgentID() {
		return agentID;
	}



}
