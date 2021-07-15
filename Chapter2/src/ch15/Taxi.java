package ch15;

public class Taxi {

	String companyName;
	int money;
	
	
	public Taxi(String companyName) {
		super();
		this.companyName = companyName;
	}

	//택시입장에서 수입
	public void take(int money) {
		this.money+=money;
		
	}
	
	public void showTaxiInfo() {
		System.out.println(companyName + "택시 수입은 " + money + "원 입니다.");
	}

}
