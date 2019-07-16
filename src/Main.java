import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    	ArrayList<Account> custom = new ArrayList<Account>();
    	
    	custom.add(new Account(2345 , "JAYROME"));
    	custom.get(0).getAccountNumber();
    	custom.get(0).getCustomerName();
    	custom.get(0).getBalance1();
        custom.get(0).deposit(1000);
		custom.get(0).deposit(5000);
		custom.get(0).withdraw(3000);
		custom.get(0).deposit(2500);
		custom.get(0).withdraw(1000);
		custom.get(0).addinterestrate(3);
		System.out.println("- - - - - - - - - - - - - - - - -");
		//System.out.println("\n");
		
		custom.add(new Account(2167 , "DYLAN"));
		custom.get(1).getAccountNumber();
    	custom.get(1).getCustomerName();
    	custom.get(1).getBalance1();
		custom.get(1).deposit(5000);
		custom.get(1).withdraw(1200);
		custom.get(1).deposit(500);
		custom.get(1).withdraw(500);
		custom.get(1).withdraw(400);
		custom.get(1).addinterestrate(3);
		System.out.println("- - - - - - - - - - - - - - - - -");
		
		custom.add(new Account(2019 , "MARK"));
		custom.get(2).getAccountNumber();
    	custom.get(2).getCustomerName();
    	custom.get(2).getBalance1();
    	custom.get(2).deposit(500);
		custom.get(2).deposit(1500);
		custom.get(2).deposit(200);
		custom.get(2).deposit(100);
		custom.get(2).addinterestrate(3);
		System.out.println("- - - - - - - - - - - - - - - - -");
		
		custom.add(new Account(2874 , "TYLER"));
		custom.get(3).getAccountNumber();
    	custom.get(3).getCustomerName();
    	custom.get(3).getBalance1();
    	custom.get(3).deposit(2400);
		custom.get(3).deposit(1500);
		custom.get(3).withdraw(1000);
		custom.get(3).withdraw(900);
		custom.get(3).withdraw(200);
		custom.get(3).addinterestrate(3);
		System.out.println("- - - - - - - - - - - - - - - - -");
		
		custom.add(new Account(2630 , "JOHNNY"));
		custom.get(4).getAccountNumber();
    	custom.get(4).getCustomerName();
    	custom.get(4).getBalance1();
    	custom.get(4).deposit(1000);
		custom.get(4).withdraw(500);
		custom.get(4).deposit(400);
		custom.get(4).withdraw(200);
		custom.get(4).withdraw(100);
		custom.get(4).addinterestrate(3);
		System.out.println("- - - - - - - - - - - - - - - - -");
		
		double n = custom.get(0).getBalance();{ 
			 
			 for (int i = 0; i < custom.size(); i++) {
				 if(n < custom.get(i).getBalance()) {
			           n = custom.get(i).getBalance();
				 }
			 }
			 
			 for (int i = 0; i < custom.size(); i++) {
				 if(n == custom.get(i).getBalance()) {
					 System.out.println("\n");
					 System.out.printf("The person with highest account balance is %s ($%.2f)\n",custom.get(i).customerName,n);
				 }
			 }
			 
			 for (int i = 0; i < custom.size(); i++) {
				 if(n > custom.get(i).getBalance()) {
			           n = custom.get(i).getBalance();
				 }
			 }
			 
			 for (int i = 0; i < custom.size(); i++) {
				 if(n == custom.get(i).getBalance()) {
					 System.out.printf("The person with lowest account balance is %s ($%.2f)\n",custom.get(i).customerName,n);
					 System.out.println("\n");
				 }
			 }
			 
			 String Deposit = "D", Withdraw = "W";
			 int[] Dtimes,Wtimes;
			 Dtimes = new int[10];
			 Wtimes = new int[10];
		        for (int j = 0; j < custom.size();j++) {
		        	for (int i = 0; i < custom.get(j).getTransactions().length(); i++) {
			            if (custom.get(j).getTransactions().substring(i).startsWith(Deposit)) {
			                Dtimes[j] ++;
			                Wtimes[j] --;
			                if(Wtimes[j] == 1) {
			                	Wtimes[j]++;
			                }		               
			            }
			            else {
			            	Dtimes[j] --;
			            	Wtimes[j] ++;
			            	if(Dtimes[j] == 1) {
			            		Dtimes[j]++;
			            }
			         }
		          }
		       }
		        for (int i = 0; i < custom.size(); i++) {
		        	if(Dtimes[i] > Wtimes[i]) {
		        		System.out.println(custom.get(i).customerName + " : Longest repeating activity : Deposit (" + Dtimes[i] +" times)" );
		        	}
		        	else if(Dtimes[i] < Wtimes[i]) {
		        		System.out.println(custom.get(i).customerName + " : Longest repeating activity : Withdraw (" + Wtimes[i] +" times)" );
		        	}	
		        }
			
			}
    }
}
		

	