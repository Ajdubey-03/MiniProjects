package demo_2024_projects_practice;

import java.util.Scanner;

public class LibAppLaunch {
	

	boolean action =true;
	Scanner sc = new Scanner(System.in);
	BasicLibrary bl = new BasicLibrary();
	UsersCollection uc = new UsersCollection();
	
	public LibAppLaunch() {
		System.out.println("Login-->> || <<--Signup ");
		System.out.println("choose any options");
		String input =sc.nextLine().toLowerCase();
		char in =input.charAt(0);
		
		switch(in)
		{
		case 'l':
			login();
		break;
		case 's':
			signUp();
		break;
		default:
			System.out.println("Invalid input");
				
		}
		
	
		

		
				
	}

	
	private void signUp() {
		
	}

	private void login() {
		System.out.println("Enter your User name");
		String username = sc.next();
		for(int i=0; i<uc.userName.size(); i++){
			
			if(username.equals(uc.userName.get(i)))
			{
				System.out.println();
			}else 
			{
				System.out.println("No user Found");
				break;
			}
		}
		
		
		{
			System.out.println("Enter your Password");
			String password = sc.next();
			if(!password.equals(uc.Password.get(0))){
				System.out.println("Inavlid Password");
			}else
			{
				System.out.println("Login Succesfully..\nWelcome  "+ uc.userName.get(0));
				
			
			
				do {System.out.println("Choose any options\n(1)Add Book \n(2)Show Book \n(3)Issue Book\n(4)Return Book");
				int in =sc.nextInt();
				switch(in)
				{
				case 1:
					sc.nextLine();
					System.out.println("Enter Book Name here");
					String bk =sc.nextLine();
					bl.addBook(bk);
					System.out.println("(1) Exit\n(2) Next");
					int usNx = sc.nextInt();
					if(usNx==1) 
					{
						action =false;
						sc.close();
					}else 
					{
						continue;
					}
					break;
				case 2:
					bl.showBooks();
					break;
				case 3:
					System.out.println("BookName");
					String bookName =sc.nextLine();
					bl.issuBook(bookName);
					break;
				case 4:
					System.out.println("Return Book not implemented yet");
					break;
				default:
					System.out.println("Invalid Input");
				
				}
				}while(action);
				
				
				
			}
				
			
			
			
			
			
			
		}else 
		{
			System.out.println("Sorry,No userFound");
		}
		
		
		
		
	}
	
	
}