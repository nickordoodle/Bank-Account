
public class BankAccountDriver {
	
	public static void main (String[] args){
	BankAccount a = new BankAccount("25", "Bilbo Baggins", "42 Bag End, The Shire 04326", 200.00);
		
	a.withdrawMoney(50.00);
	System.out.println("Bilbo is left with: " + a.getBalance());
	
	a.changeAddress("35 College Ave, The Mistry Mountain 23475");
	System.out.println("Bilbo has moved to: " + a.getAddress());
	
	BankAccount b = new BankAccount("50", "Smaug", "35 College Ave, The Misty Mountain 23475", 10000.00);
	b.transfer(a, 200.00);
	System.out.println("bilbo has: " + a.getBalance());
	System.out.println("Smaug has: " + b.getBalance());
	
	a.payInterest(.01);
	System.out.println("Bilbo has: " + a.getBalance());
		
	
	}
	
	
	
}
