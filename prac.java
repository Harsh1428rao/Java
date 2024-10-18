package Java;
import java.util.*;


class Animal{
  int a=10;  
    
}

class dog extends Animal{
    int b=20;
    dog(){
    System.out.println(a+b);
    }
}

public class prac {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);
        dog obj = new dog();
        
    }
}
