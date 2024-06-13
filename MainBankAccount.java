
public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savingsAccount=new BankAccount(1254965874L,15236.24f,"Nesha");
		//invoke the methods
		savingsAccount.showBalance();
		savingsAccount.deposit(10000.00f);
		savingsAccount.showBalance();
		savingsAccount.withdraw(5000.00f);
		savingsAccount.showBalance();
		//recurring account
		BankAccount rdAccount=new BankAccount(2458966L,50000.00f,"Abhiveera");
		savingsAccount.showBalance();
		savingsAccount.deposit(10000.00f);
		savingsAccount.showBalance();
		savingsAccount.withdraw(5000.00f);
		savingsAccount.showBalance();
		BankAccount sadafAccount=new BankAccount(2458966567L,60000.00f,"sadaf");
		savingsAccount.showBalance();
		savingsAccount.deposit(10000.00f);
		savingsAccount.showBalance();
		savingsAccount.withdraw(5000.00f);
		savingsAccount.showBalance();
		

	}

}
