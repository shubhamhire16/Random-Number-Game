import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int RandomNumber = (int)(Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("I have randomly chosen a number from 1 to 100");
        System.out.println("Guess the number in 10 chances");
        Scanner sc = new Scanner(System.in);
        for(int i = 10; i > 0; i--){
            System.out.println("You have "+ i + " guess(es) left. Choose again: ");
            int guess = sc.nextInt();
            if (guess > RandomNumber){
                System.out.println("It's smaller than " + guess);
            }
            if (guess < RandomNumber){
                System.out.println("It's greatrer than " + guess);
            }
            if(guess == RandomNumber){
                hasWon = true;
                break;
            }


            }
        if(hasWon){
            System.out.println("You've Won!!!!!!!!!");
            System.out.println("The number was "+ RandomNumber);

        }
    }
}