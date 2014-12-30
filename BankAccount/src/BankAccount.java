
public class BankAccount {
	
	private String name;
	private double balance;
	private String address;
	private String accountNumber;
	
	public BankAccount(String acctnmbr, String name, String a, double initial){
		
		this.name = name;
		balance = initial;
		address = a;
		accountNumber = acctnmbr;
		//only need this when using same variable names???
	}

	public boolean depositMoney(double amount){
		
		if (amount > 0){
			balance += amount;
			return true;
		}
		else{
		return false;
		}
	}
	
	public boolean withdrawMoney(double amount){
		if (balance >= amount && amount > 0){
			balance -= amount;
			return true;
		}
		
		else
		{
			return false;
		}
		
		
	}
	
	public boolean payInterest(double interestRate){
		if (interestRate > 0){
			balance += (balance * interestRate);
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public boolean changeAddress(String newAddress){
		
		if (Character.isDigit(newAddress.charAt(0)) && !newAddress.equals("")){
			address=newAddress;
			return true;
			
		}
		
		return false;
	}
	
	public boolean transfer(BankAccount otherPerson, double amount){
		
		if (amount > balance){
			return false;
		}
		otherPerson.depositMoney(amount);
		withdrawMoney(amount);
		return true;
		
	}
}
