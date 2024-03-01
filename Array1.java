

import java.util.Scanner;

public class Array1{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];//declaring a array
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("The elements in the array are:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}