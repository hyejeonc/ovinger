package ovinger;

public class account {
	private double balance;
	private double percInterest;
	private double decInterest;
	
	public void deposit(double depositMoney) {
		if (depositMoney < 0) {
			System.out.println("Invalid deposit money value, try again please.");
		} else {
			this.balance += depositMoney;
			return;			
		}
	}
		
	public void addInterest() {
		this.balance = this.balance * (1 + this.decInterest);
	}
	
	public double getBalance() {
		System.out.println("The amount of balance in your account is "+balance+"NOK.");
		return balance;
	}
	
	public double getInterestRate() {
		return percInterest;
	}
	
	public void setInterestRate(double a) {
		this.percInterest = a;
		System.out.println("The new value of interest in your account is "+percInterest+"%.");
	}
}
