import java.util.Scanner;

public class Logicaloperator {

	public static void main(String[] args) {
		
System.out.println("Logical Operators");
		
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value ");
		value=sc.nextInt();
		if(value >=10 && value %2==0 ){
			System.out.println("value is > 10 and its even");
		}
		else {
			System.out.println("doesn't satisfy");
		}
		
		int value1;
		System.out.println("Enter the value ");
		value1=sc.nextInt();
		if(value1>35 || value1==35) {
			System.out.println("the condition satisfies");
		}
		else {
			System.out.println("the condition fails");
		}
		

	}

}
