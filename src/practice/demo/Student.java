package practice.demo;

public class Student {
	
	int id;           //Instant variable , create inside call but outside of methods
	String name;
	
	public static void main(String args[]) {     //Main methods
		
		Student s = new Student(); // create object of the Student Class
		
		System.out.println(s.id);
		System.out.println(s.name);
		
		// initialized variables
		s.id =102;
		s.name="Akshay";
		
		Student s1 = new Student();  // Multiple object can create of any classes
		s1.id =102;
		s1.name="Akshay";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		testStudent1 s2 = new testStudent1();
		
		s2.cat="Gen";
		s2.sec="Science";
		
		System.out.println(s2.cat);
		System.out.println(s2.sec);
		
		
	}

}

class testStudent1 {
	String cat;
	String sec;

}
