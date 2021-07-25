package fa.training.entities;

public class SavingsAccount {
	private double dailyInterestRate;
	private double savingsBalance;
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(double dailyInterestRate, double savingsBalance) {
		super();
		this.dailyInterestRate = dailyInterestRate;
		this.savingsBalance = savingsBalance;
	}
	public double getDailyInterestRate() {
		return dailyInterestRate;
	}
	public void setDailyInterestRate(double dailyInterestRate) {
		this.dailyInterestRate = dailyInterestRate;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public Double calculateMonthlyInterest(){
		double monthlyInterest=0.0d;
		monthlyInterest=(savingsBalance*dailyInterestRate/100)/12;
		savingsBalance+=monthlyInterest;
		return monthlyInterest;
	}
}
