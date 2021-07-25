package fa.training.entities;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount savAcc1= new SavingsAccount(4, 2000);
		SavingsAccount savAcc2= new SavingsAccount(4, 3000);
		System.out.println("Then calculate the monthly interest with the annualInterestRate to "+savAcc1.getDailyInterestRate()+"%: ");
		System.out.println("Person monthly interest 1: "+savAcc1.calculateMonthlyInterest());
		System.out.println("Person monthly interest 2: "+savAcc2.calculateMonthlyInterest());
		System.out.println("the new balances for both savers: ");
		System.out.println("The new balances person 1: "+savAcc1.getSavingsBalance());
		System.out.println("The new balances person 2: "+savAcc2.getSavingsBalance());
		
		System.out.println("Then calculate the monthly interest with the annualInterestRate to 5%: ");
		savAcc1=new SavingsAccount(5, 2000);
		savAcc2=new SavingsAccount(5, 3000);
		System.out.println("calculate the next month’s interest 1: "+savAcc1.calculateMonthlyInterest());
		System.out.println("calculate the next month’s interest 2: "+savAcc2.calculateMonthlyInterest());
		System.out.println("the new balances for both savers: ");
		System.out.println("The new balances person  1: "+savAcc1.getSavingsBalance());
		System.out.println("The new balances person 2: "+savAcc2.getSavingsBalance());
		
		
		

	}

}
