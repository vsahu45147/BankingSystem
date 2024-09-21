package BankMangementSystem;

public class Account 
{
	private String firstName;
	private String lastName;
	private int accid;
	private double balance;
	private int passcode;
	public Account()
	{
		this.firstName = null;
		this.lastName = null;
		this.accid = 0;
		this.balance = 0.0;
		this.passcode=0;
	}
	public Account(String firstName, String lastName, int accid, double balance, int passcode) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.accid = accid;
		this.balance = balance;
		this.passcode=passcode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPasscode() {
		return passcode;
	}
	public void setPasscode(int passcode) {
		this.passcode=passcode;
	}
}


	