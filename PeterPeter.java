import java.lang.*;
import java.util.Scanner;
public class PeterPeter{
  
    public static void main(String[] args)
    {
  
        // Take input from the user
        System.out.println("Enter a string ");
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        int n=a.length();
        String dashes="";
        for(int i=0;i<n;i++){
            dashes=dashes+"-";
        }
        System.out.println(dashes);
        System.out.println("Enter a character :");
        String m=sc.next();
        String finalstr="";
        String missedletter="";
        if (m.length()==1){
            for(int i=0;i<n;i++){
                if (a.charAt(i)!=m.charAt(0)){
                    finalstr=finalstr+dashes.charAt(i);

                }
                else{
                    finalstr=finalstr+m.charAt(0);
                }
            }
        }else{
            System.out.println("enter only one character");
            missedletter=m;
            System.out.println("Missed character"+missedletter);
        }
        
        System.out.println(finalstr);
    }
}