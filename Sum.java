
import java.util.Scanner;

public class Sum{
    public static void main(String[] args)
    {
        int a,b,sum;
        Scanner scan = new Scanner(System.in);//Created a object of the Scanner class to use to take inputs from the user
    
        System.out.println("Enter the Number");
        a = scan.nextInt();// used the object of the scanner class to to take input nextInt() is a method from the scanner class just like the function from a class in cpp calling it and using it with 

        System.out.println("Enter the Number");
        b = scan.nextInt();

        sum = a + b;
        

        System.out.println("Sum is :" + sum);

        scan.close();
    }
}
