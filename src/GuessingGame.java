import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 10");
        int correct = (int)(Math.random()*11);
        System.out.print("Guess Number 1: ");
        try{

            if(check(scanner.nextInt(), correct)){
                System.exit(0);
            }}
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
            scanner.next();
        }
        System.out.print("Guess Number 2: ");
                try{

            if(check(scanner.nextInt(), correct)){
                System.exit(0);
            }}
             catch(InputMismatchException e){
            System.out.println("Invalid Input");
            scanner.next();
        }
        System.out.print("Guess Number 3: ");
        try{

            if(check(scanner.nextInt(), correct)){
                System.exit(0);
            }else{
                System.out.println("Out of Attempts!");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
            scanner.next();
        }


    }
    public static boolean check(int guess, int ans){

           if (guess == ans) {
               System.out.println("Congratulations! You win!");
               return true;

           } else if (guess > ans) {
               System.out.println("Your number is too high!");
               return false;
           } else {
               System.out.println("Your number is too low!");
               return false;
           }

    }
}