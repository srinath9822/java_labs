package labthursday;

import java.util.*;
public class StudentsDetails {
	Scanner s = new Scanner(System.in);
	String name,id,course;
	public StudentsDetails()
	{
		System.out.println("Enter a student name : ");
		name=s.next();
		System.out.println("Enter a student id : ");
		id=s.next();
		System.out.println("Enter a 3 subject marks : ");
		couse=s.next();
	}
	
	public void showdetails()
	{
		System.out.println("\tStudent name = "+name);
		System.out.println("\tStudent id = "+id);
		System.out.println("\tStudent course = "+course);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of students : ");
		n=sc.nextInt();
		StudentsDetails [] s=new StudentsDetails[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the following details for Student number - "+(i+1));
			s[i]=new StudentsDetails();
		}
		System.out.println("\n\n");
		System.out.println("\tThe student report is");
		System.out.println("   -----------------------------------");
		for(int i=0;i<n;i++)
		{
			System.out.println("     Following details for Student number - "+(i+1));
			s[i].showdetails();	
			System.out.println();
		}
	}

}
