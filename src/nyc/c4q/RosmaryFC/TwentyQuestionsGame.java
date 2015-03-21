package nyc.c4q.RosmaryFC;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by c4q-rosmary on 3/18/15.
 * Twenty Questions Game
 * Write a program which assumes a random integer X in some range, say 1 - 100,000.
 * It prompts you to input a number and responds with the following information:

 Input number is higher than X
 Input number is lower than X
 Input number is equal to X, in which case you win the game
 Your program gives 20 chances to guess the number and you lose if you fail to guess.
 You can use Java's Math.random() to generate a random number. Note that it returns a double, but we want an int
 */
public class TwentyQuestionsGame {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(100000) + 1; //100,000 is the maximum, 1 is the minimum
        //int answer = 700;
        int guess;


        for(int i = 1; i <= 20; i++) { // 20 is number of guesses.
            System.out.print("Guess a number 1 - 100,000 : ");
            guess = keyboard.nextInt();

            if (guess == answer) { // game is over once user is correct
                System.out.println("Correct, input number is equal to guess. You win!");
                return;
            } else { // if user is incorrect, it will ask for input again
                if (guess < 0 || guess > 100000) {
                    System.out.println("Your number is not between 1 - 100,000");
                } else if (guess < answer) {
                    System.out.println("Your number is too low.");
                } else { //if guess > answer
                    System.out.println("Your number is too high.");
                }
            }
            System.out.println("You have used up  " + i + " out of 20 guesses.");
        }
        System.out.println("You have used up all your attempts. You lost.");
    }
}
