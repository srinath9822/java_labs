package javaexamples;


public class Static {
	static int a, b, c;  //Creating static variables
	static { 
		//block 1
		a = 10; 
		b = 20;
		// assigning the values of the variables a,b.
		c = a + b; 	
		// adding the values a and b and storing it in c.
	}
	static {
		// As it is a static block and the variables are also static it can accessed here as well
		System.out.println("Value of a : " + a + "\nValue of b : " + b);
		System.out.println("Sum of a + b = " + c);
	}

	static int cube(int x) {
		return x * x * x;
		// area of cube=side x side x side
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = cube(3); 
		// we are calling the cube method which is static and calling without the class name.
		// The return value of the function is stored in the variable res.
		System.out.println("Area of cube is : "+res);
		// we are printing the result here
		System.out.println("Checking whether the main function code will execute first or invoke all static blocks");

	}
}
