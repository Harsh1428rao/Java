import java.util.Scanner;

public class Multiply{
    public static void main(String[] args){
        int a,rem,sum=1;
        Scanner Scan = new Scanner(System.in);
        System.out.println
        ("Enter the Number: ");
        a= Scan.nextInt();
        while(a>0){
            
            rem=a%10;
            sum=rem*sum;
            a=a/10;
        }
        System.out.println("Multiplicaton of all digits are: "+ sum);
        Scan.close();

    }
}