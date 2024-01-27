package practice.demo.arrays14;

public class ArrysPracatice_01 {

	public static void main(String[] args) {
	
		double[]arr1 = {10.09,112.09, 25.08,11.00,102.0,2.01};
		
		double[] x= {0.3,0.6,0.1};
		double[] y= {0.5,0.1,0.4};
		double sum =0.0;
		for(int i =0; i<3; i++) {
			sum +=x[i]*y[i];
			System.out.println(sum);
			
			
			
		}
		
	//	ArraysRev.NrandomNumber(3);
		
	//	ArraysRev.printArray(4);
		
		//ArraysRev.printCompyArr(4);
	double maxOne=	ArraysRev.maxArrayValue(arr1);
		System.out.println(maxOne);
		
		
		


	}

}

class ArraysRev{
	
	public static double[] NrandomNumber(int n) {
		double[]a=new double[n];
		for(int i =0; i<n; i++) {
			a[i]=(Math.random()*100+1);
		
		}
		return a;
	}
	
	public static void printArray(int n) {
	double[]a = NrandomNumber(n);
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static double[] copyArr(int n) {
		double[]a = NrandomNumber(n);
		double b[] = new double[n];
		for(int i =0; i<n; i++) 
		{
			b[i]=a[i];
		}
		return b;
	}
	
	public static void printCompyArr(int n) 
	{
		
		double cA[]=copyArr(n);
		for(double d:cA) {
			System.out.println(d);
		}
		
		
	}
	
	public static double maxArrayValue(double[]arr) {
		double max=  Double.MIN_VALUE;
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max =arr[i];
			}
			
		}
		return max;
	}
	
	
}
