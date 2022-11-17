package advt;
//import ArrayList package
import java.util.ArrayList;

public class Differentarray {

	public static void main(String[] args) {
	
				// create ArrayList list1
				ArrayList<String>
				Array1 = new ArrayList<String>();
				
				// Add values in ArrayList
				Array1.add("Hi");
				Array1.add("My");
				Array1.add("Name");
				Array1.add("is");
				Array1.add("Srinath");

				// print list 1
				System.out.println("List1: "+ Array1);

				// Create ArrayList list2
				ArrayList<String>
				Array2 = new ArrayList<String>();

				// Add values in ArrayList
				Array2.add("Hi");
				Array2.add("i am");
				Array2.add("Srinath");

				// print list 2
				System.out.println("List2: "+ Array2);

				// Find the common elements
				Array1.retainAll(Array2);

				// print list 1
				System.out.println("Common elements: "+ Array1);
			}
	}
