import java.util.Scanner;
//creating a class for the object creation and creating the object  of this class in main method of the Mainclass
 class Sum{
    int a,b;
    public void get(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = scan.nextInt();
        System.out.println("Enter the Second number: ");
        b = scan.nextInt();
        scan.close();

    }
    public void show(){
        System.out.println("Sum is : "+(a+b));
    }
}

public class Mainclass{
    public static void main(String[] args) {
        Sum s = new Sum();
        s.get();
        s.show();
    }
}