package practice.demo;

public class BankAccount {
	double accountBalance;
	String name;
	String customerId;
	double prvsTxn;
	String [] previousTxn;
	int txnNo;
	int nStatemet;
	
	
	
	public BankAccount(String name, String customerId){
		this.name =name;
		this.customerId=customerId;
		System.out.println("Welcome you " + name);
		System.out.println("Your CustId :: " + customerId);
		previousTxn= new String[100];
		txnNo=0;
		
	}
	
	public void amountDeposit(double amount) {
		if(amount !=0 && amount>=500 && amount%100==0) 
		{
			
			System.out.println(amount + ":: amount has beed added successfully!!");
			accountBalance =accountBalance+amount;
			previousTxn[txnNo]="Dposited amount :" +amount ;
			txnNo++;
			
		}else if(amount<500)
		{
		System.out.println("Minimum 500 Allowed");
		}else if(amount>500 && amount <=500000 && amount%100 !=0) 
		{
		System.out.println("Please Add amount of multiply of 100*");
		}else
		{
			System.out.println("Exceed amount limit");
		}
		
		
	}
	
	
	
	public void checkBalance(){
		System.out.println("Your account Balance is :: "+ accountBalance);
	}
	
	
	public void withdrawAmount(double amount) {
		if(amount >accountBalance) 
		{
		System.out.println("Insufficient fund in your Account");
		}
		else if(amount<500 && amount <accountBalance) 
		{
			System.out.println("Enter 500 or greater Amount to withdraw");
		}
		else if(amount<500 && amount <accountBalance && amount%100 !=0) 
		{
			System.out.println("Please Enter Multiply of 100");
		}else
		{
			System.out.println(amount +": Amount has been successfully debited from your account");
			accountBalance =accountBalance-amount;
			previousTxn[txnNo]="Debited amount -" +amount;
			txnNo++;
		}
		
		
		
	}
	
	public void getNoStatement(int nStatemet){
		for(int i =0; i<nStatemet; i++) 
		{
			if(previousTxn[i]!=null)
			{
				System.out.println( i+1 +":" +previousTxn[i]);
			}else 
			{
			continue;
			}
			
		}
	}
	
	public void getAllStatement(){
		for(int i =0; i<previousTxn.length; i++) 
		{
			if(previousTxn[i]!=null)
			{
				System.out.println( i+1 +":" +previousTxn[i]);
			}else if(previousTxn[0]==null) 
			{
				System.out.println("No Txn found");
				break;
	
			}
			else 
			{
			continue;
			}
			
		}
	}
	
	
	

}
