

import java.util.Scanner;

public class Guessnumber{
    public static void main(String args[]){
        int number=(int)(Math.random()*101);

        Scanner input = new  Scanner(System.in);
        int Guess=-1;
        //System.out.println(number);

        while(Guess!= number){
        System.out.println("Guess a magic number between 0 and 101");
         
        Guess = input.nextInt();
        if (Guess > number) {
            System.out.println("Your guess is too high!");
        } else if (Guess < number) {
            System.out.println("Your guess is too low!");
        }    
        else if(Guess==number){
            System.out.println("Congratulations! You've guessed the right number.");
        }
         }
        System.out.println("Congratulations! You've guessed the right number.");
    }
}