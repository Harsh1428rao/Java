import java.util.Scanner;
//sum of two number with the help of object and class

public class Sum1{
    int a,b;
    void get(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        a=scan.nextInt();
        System.out.println("Enter the Second number: ");
        b = scan.nextInt();
        scan.close();
    }

    void show(){
        System.out.println("Sum is : "+(a+b));
    }

    public static void main(String args[]){
        Sum1 s = new Sum1();
        s.get();
        s.show();
    }
    
}