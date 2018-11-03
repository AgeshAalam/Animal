package spring.beans.refs;

public class Address {
	
	int dno;
	String stree;
	String city;
	String state;
	String pincode;
	
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getStree() {
		return stree;
	}
	public void setStree(String stree) {
		this.stree = stree;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", stree=" + stree + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	

}
