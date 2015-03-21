package nyc.c4q.RosmaryFC;
 import java.util.Scanner;

/**
 * Created by c4q-rosmary on 3/19/15.
 * Fibonacci
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 Write a program which accepts as input an integer N and returns the N-th Fibonacci number.
 To test whether your program returned the correct number, go to Wolfram Alpha,
 and enter fibonacci(N) where N is your input integer
 */
public class Fibonacci { //first + second (new first) = answer (new second), first + second = answer, first + second = answer, ...
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //chose long due to int overflow after a certain number inputted into int n
        long first = 0;
        long second = 1;
        long answer = 0;
        int n;

        System.out.print("Fibonacci number : ");
        n = keyboard.nextInt();

        if (n == 0) { //exception. fibonacci number sequence will start at 0
            answer = first;
            System.out.println(answer);
        }
        if (n == 1) {
            answer = second; // exception. fibonacci number sequence will start at 1
            System.out.println(answer);
        }

        for (int i = 2; i <= n; i++) { //returns the nth fibonacci number

            answer = first + second;

            //will change input for variables first and second for next loop
            first = second;
            second = answer;

        }
        System.out.println(answer);//Once it has reached the end of the loop it will print out final variable

    }
}
