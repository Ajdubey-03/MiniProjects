package practice.demo;

final public class FinalClassTest {
	
	// final -->> variable, method and Class
	
	// final variable can not be change
	// final method can not be override in the child class
	// final method is by default is public 
	// final class can not be extends 
	//due to this interface came in picture
	
	final int a =10;
	
	final void dispaly() {
	//	 a =25;  // Not valid because A is final variable
		System.out.println(a);
	}

	
	/* class Test123 extends FinalClassTest{    //final class can not extend 
		
		 /* final method can not override on 
		  
		 void dispaly() {
			 System.out.println("display is overiden here...");
		 }
		 */
	 }*/
	

	
	public static void main (String []args) {
		
		
		
	}

}
