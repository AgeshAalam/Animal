package spring.beans.refs;

import java.util.List;
import java.util.Set;

public class Student {
	
	int rollNo;
	String name;
	String claz;
	Address address;
	Account account;
	List emails;
	Set hobbies;
	
	public Set getHobbies() {
		return hobbies;
	}
	public void setHobbies(Set hobbies) {
		this.hobbies = hobbies;
	}
	public List getEmails() {
		return emails;
	}
	public void setEmails(List emails) {
		this.emails = emails;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClaz() {
		return claz;
	}
	public void setClaz(String claz) {
		this.claz = claz;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", claz=" + claz + ", address=" + address + ", account="
				+ account + ", emails=" + emails + ", hobbies=" + hobbies + "]";
	}
	
	}
	
	

	

