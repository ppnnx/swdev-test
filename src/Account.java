
public class Account {
  int accountNumber = 0;
  String customerName , transactions = "";
  double interestRate;
  private double balance;
  
  
  public Account(int accountNumber , String customerName){
    this.accountNumber = accountNumber;
    this.customerName = customerName;
    balance = 0.0;
  }
  
  public double getAccountNumber(){
	  System.out.println("Account No. : " + accountNumber);
	  
	    return accountNumber;
	  }

  public String getCustomerName() {
	  System.out.println("Name : " + customerName);
	    return customerName;
	  }


  public void deposit(double amount) {  
	  if (amount > 0) {
	  balance = balance + amount;
	  System.out.println("/ deposit /");
	  System.out.println("++++ "+ amount);
	  System.out.println("Balance : " + balance);
	  transactions = transactions + "D";
	  return ;
	  }  
	  
	  
  }

  public void withdraw(double amount){
    if(amount > 0 && (this.balance - amount) >= 0){
      this.balance -= amount;
      //System.out.printf("Account No. : %d\n" , accountNumber);
	  System.out.println("/ withdraw /");
	  System.out.printf("---- %.2f\n",amount);
	  System.out.printf("Balance : %.2f\n",balance);
	  transactions = transactions + "W";
    }
    else {
    	System.out.println("/ withdraw /");
    	System.out.println("Error , Your money is not enough");
		//System.out.printf("Account : %d\n",accountNumber);
		//System.out.printf("Name : %s\n",customerName);
		System.out.printf("Balance : %.2f\n",balance);
		transactions = transactions + "W";
    }
    return;
  }
 
  public String getTransactions() {
		return transactions;
  }
  
  public double getBalance(){
	  	//System.out.println("\nBalance : " + balance);
	    return balance;
  }
  
  public double getBalance1() {
	  System.out.println("\nBalance : " + balance);
	  return balance;
  }
  
  
  public void addinterestrate(double interestRate){
		interestRate = interestRate * 1.2;
		balance = balance + ((balance * interestRate * 30)/ 36500);
		System.out.println("\nShow Balance with InterestRate");
		//System.out.printf("Account : %d\n",accountNumber);
		//System.out.printf("Name : %s\n",customerName);
		System.out.printf("InterestRate : %.2f%% \n",interestRate);
		System.out.printf("Balance : %.2f\n",balance);
	}

public Account get(int i) {
	// TODO Auto-generated method stub
	return null;
}	
}