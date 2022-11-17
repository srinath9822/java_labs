import java.util.InputMismatchException;
import java.util.Scanner;
public class JavaCalculator{
  
    public static void main(String[] args)
    {
        // stores two numbers
        double num1, num2;
  
        // Take input from the user
        
  
        System.out.println("Enter two numbers");
  
        // take the inputs
      
        try(Scanner sc = new Scanner(System.in);){
            num1 = sc.nextInt();
  
            num2 = sc.nextInt();
            System.out.println("Enter the operator (+,-,*,/)");
            char op = sc.next().charAt(0);
            double o = 0;

            switch (op) {
  
                // case to add two numbers
                case '+':
          
                    o = num1 + num2;
          
                    break;
          
                // case to subtract two numbers
                case '-':
          
                    o = num1 - num2;
          
                    break;
          
                // case to multiply two numbers
                case '*':
          
                    o = num1 * num2;
          
                    break;
          
                // case to divide two numbers
                case '/':
          
                    o = num1 / num2;
          
                    break;
        
                default:
          
                    System.out.println("You enter wrong input");
          
                    break;
            }
            System.out.println("The final result:");
  
            System.out.println();
  
            // print the final result
            System.out.println(num1 + " " + op + " " + num2+ " = " + o);
        }
        catch(InputMismatchException|ArithmeticException  e){
            System.out.println(e.getMessage());
        }

        
  
        
    }
}
