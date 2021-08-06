
public class TestCustomer {
	public static void main(String[] args) {
	    Customer customer = new Customer();
		customer.setCustomerName("John");
		
		Address address = new Address("Ist Main HSR Layout","Bangalore");
		customer.setResidentialAddress(address);
		System.out.println("Customer: " + customer.getCustomerName());
		System.out.println("Residential Address: " + customer.getResidentialAddress().getAddressDetails());
		
		Customer customer2 = new Customer("John",address);
		System.out.println(customer2.getCustomerDetails());

	}
}
