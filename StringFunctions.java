public class StringFunctions {
    
    public static void main(String[] args) {
        //create strings
        String s1="Java";
        String s2=" Programming";
        char arr[]={'i','s','g','o','o','d'};
        String s3= new String(arr);

        //display all three strings
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //length
        System.out.println("Length of s1 is:"+s1.length());
        System.out.println("Length of s2 is:"+s2.length());
        System.out.println("Length of s3 is:"+s3.length());

        //concatenate
        System.out.println("s1 + s2 is:"+ s1.concat(s2));
        System.out.println("s1 + s3:"+s1.concat(s3));

        //sub string
        System.out.println("Sub String in s2:"+s2.substring(0,8));

        //to uppercase
        System.out.println("To uppercase of s1:"+s1.toUpperCase());

        //to lowercase;
        System.out.println("Lowercase of s1 is:"+s1.toLowerCase());

    }
}
