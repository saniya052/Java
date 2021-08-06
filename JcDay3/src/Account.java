
public class Account {
	private int accountNo;
	private double accountBalance;
	private double intRate;
	
	

	public Account(int accountNo, double accountBalance, double intRate) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.intRate = intRate;
	}
	
	

	public int getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}



	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	public double getIntRate() {
		return intRate;
	}



	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}



	public String getAccountDetails(){
		return ("Account No: " + accountNo + " Balance: " + accountBalance
				+ " Interest Rate: " + intRate);
	}
	
	public double calculateInterest(double amount, double duration) {
		double interest = intRate*amount*duration/100;
		return interest;
	}
}
