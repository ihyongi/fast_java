package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010,"이순신");
		/*
		 * customerLee.setCustomerName("이순신"); customerLee.setCustomerID(10010);
		 */
		customerLee.bonusPoint=1000;
		int price =customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerKim=new VIPCustomer(10020,"김유신");
		/*
		 * customerKim.setCustomerName("김유신"); customerKim.setCustomerID(10020);
		 */
		customerKim.bonusPoint=10000;
		price =customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo());
		
		//3
		Customer customer=new VIPCustomer(12345,"noname");
		System.out.println(customer.calcPrice(1000));
		System.out.println(customer.showCustomerInfo());
	}

}
