package practice.demo;

//Interface is a blue print of class
//Interface variable is by default final 
//Interface method is by default public,static
//Interface By default static and public 
// Interface can not instantiate directly but can achieve by using implements
// Interface method contains abstract method only
// Abstract method ::-->> method can only definition not implementation
//Interface class can not extends by child class
// Interface class can be implements

interface A {
	int a1 = 10;

	public void method1(); // Method only definition not implementation here
//	public void method2();
}

class B implements A {
	// not valid with extends use implements by achieve using implements and Method
	// should be implement here from the parent class

	public void method1() { // Interface method by default as Public and static
		System.out.println(a1);
	}

	public void method2(int age, String name) {

		System.out.println("My name is " + name + " my age is " + age);

	}

}

public class InterfaceExamples {
	public static void main(String[] arg) {

		// A obja= new A(); // Interface Method can not directly instantiated , can
		// achieve by using child class

		A objb = new B();

		B objc = new B();

		objb.method1();
		objc.method1();
		objc.method2(28, "Aj");

	}

}
