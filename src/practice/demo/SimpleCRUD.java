package practice.demo;
import java.util.Scanner;


public class SimpleCRUD {

	int row;
	final int col;
	String[][] users;
	int rowCount = 0;

	public SimpleCRUD() {
		row = 10;
		col = 3;
		users = new String[row][col];
		
		
	}

	public <users> String[][] addUser(String userName, String Email) {
		
		
		if(Email.endsWith(".com") || Email.endsWith(".in")) {
			if (rowCount <= row) {
				users[rowCount][0] = userName;
				users[rowCount][1] = Email;
				users[rowCount][2]=passWordGen();
				
				rowCount++;
			}
			else {
				System.out.println("No Space");

			}
		}else 
		{
			System.out.println("Invalid EmailID..Suported type .com or .in");
		}

		 
		return users;
	}
	
	
	
	

	public void getAllUserEmail() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (users[i][j] != null) {
				
					if(j==0) 
					{
						System.out.println("userName :" + users[i][j]);
					}else if(j==1) 
					{
						System.out.println("email :" + users[i][j]);
						System.out.println("**********************");
					}else if(j==2) 
					{
						System.out.println("auth :" + users[i][j]);
						System.out.println("**********************");
					}
					
				}
				
			}
		
		}
	}

	public void addMultiuser(int no) {
		
		Scanner sc = new Scanner(System.in);
		while (no > 1) {
			System.out.println("Enter your Email && userName");
			String userName = sc.next();
			String email = sc.next();
			addUser(userName, email);
			no--;

		}
		sc.close();
	

	}
	
	
	public void getSingleUser(String userName) 
	{
		for(int i =0; i< row; i++) 
		{
			for(int j =0; j<col; j++) 
			{
				if(users[i][0]!=null && users[i][0].toString().equals(userName))
				{
					System.out.println("user Details are => ");
					System.out.println(users[i][0]);
					System.out.println(users[i][1]);
					break;
					
				}else if((users[i][0]!=null || users[i][0]==null) && i ==row-1 && j==0) 
				{
					System.out.println("No user found With given Name");
					
				}
				
			}
				
			
		}
		
	}
	
	
	public  String passWordGen() {
		String strSet ="ABCDEFGHIJKLMNOQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&^*+";
		String token="";
		while(token.length()<30)
		{
			token+=  strSet.charAt((int)(Math.random()*59));
		}
		return token;
	}
	
	
	
//	public boolean checkName(String name) 
//	{
//		if()
//	}
//	
	

}
