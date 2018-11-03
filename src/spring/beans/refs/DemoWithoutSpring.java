package spring.beans.refs;

public class DemoWithoutSpring {
	
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Bangalore");
		address.setDno(37);
		address.setPincode("560016");
		address.setStree("ABC");
		address.setState("KARNATAKA");
		
		Student s1 = new Student();
		s1.setRollNo(101);
		s1.setName("medhansh");
		s1.setClaz("XXX");
		s1.setAddress(address);
		
		
		System.out.println(s1);
		
		
	}

}
