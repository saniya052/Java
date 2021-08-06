
public class SBAccount extends Account {

	public SBAccount(int accountNo, double accountBalance, double intRate) {
		super(accountNo, accountBalance, intRate);
	}
	
	public boolean withdraw(double amount) {
		if(super.getAccountBalance() >= amount) {
			super.setAccountBalance(super.getAccountBalance() - amount);
			return true;
		}
		return false;
		
	}
	
	public void deposit(double amount) {
		super.setAccountBalance(amount + super.getAccountBalance());
	}
	
}
