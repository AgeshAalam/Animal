package spring.beans.refs;

public class Account {
	int accntNo;
	String holder;
	String branch;
	String iFSCcode;
	public int getAccntNo() {
		return accntNo;
	}
	public void setAccntNo(int accntNo) {
		this.accntNo = accntNo;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getiFSCcode() {
		return iFSCcode;
	}
	public void setiFSCcode(String iFSCcode) {
		this.iFSCcode = iFSCcode;
	}
	@Override
	public String toString() {
		return "Account [accntNo=" + accntNo + ", holder=" + holder + ", branch=" + branch + ", iFSCcode=" + iFSCcode
				+ "]";
	}
	
}