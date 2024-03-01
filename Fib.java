
import java.util.Scanner;
public class Fib{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the series:");
        int n = sc.nextInt();
        int t1=0,t2=1,t3=0;
        System.out.print(t1+" ");
        System.out.print(t2+" ");
        while(t2<=n){
            t3=t1+t2;
            System.out.print(t3+" ");
            t1=t2;
            t2=t3;
        }
    }
}