package practice.demo;

public class UsersRC {

	public static void main(String[] args) {
		
	
		
		SimpleCRUD sc = new SimpleCRUD();
		sc.addUser("akshay", "abcd@yopmail.com");
		sc.addUser("Akk", "acd@yopmail.com");
		sc.addMultiuser(2);
		sc.getAllUserEmail();
	//	sc.getSingleUser("akshay");
		
//	String tkn=	sc.passWordGen();
//		System.out.println(tkn);
		
		
		
		
		

	}
	


}
