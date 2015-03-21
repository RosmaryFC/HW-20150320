package nyc.c4q.RosmaryFC;
import java.util.Scanner;
/**
 * Created by c4q-rosmary on 3/18/15.
 * Divisor Pattern Art
 * Print a table of size NxN where an entry (i, j) is:

 @ @ character + 1 space character if i divides j or j divides i

 Two empty space characters, otherwise

 For example:

 @ @ @ @ @
 @ @   @
 @   @
 @ @   @
 @       @
 */
public class DivisorPatternArt {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
        int N ; // size of table
        System.out.print("Input a Number: ");
        N = keyboard.nextInt();// input size of table

        System.out.println("");


        for (int y = 1; y <= N; y++) { // will change the column (y)
            int x = 1;
            while (x <= N) {// will change row (x)
                if (x % y == 0 || y % x == 0) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
                x++;
            }
            System.out.println("");
        }
    }
}
