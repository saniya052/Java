
public class FDAccount extends Account {
	private double principalAmount;
	private int duration;
	private double maturityAmount;


	public FDAccount(int accountNo, double accountBalance, double intRate, double principalAmount, int duration,
			double maturityAmount) {
		super(accountNo, accountBalance, intRate);
		this.principalAmount = principalAmount;
		this.duration = duration;
		this.maturityAmount = maturityAmount;
	}
	
	public double calculateMaturityAmount() {
		maturityAmount = principalAmount + super.calculateInterest(principalAmount,duration);
		return maturityAmount;
	}
	
	
}
