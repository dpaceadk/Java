import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random obj = new Random();
        int x = obj.nextInt(25), i = 4;


        Scanner input = new Scanner(System.in);
        System.out.println("\t\tGuess a number in between 1-25: ");
        int a = 0;
        while (i >= 0) {

            a = input.nextInt();


            if (a < x)
            {
                System.out.println("\t\tYour guess is too low👎👎...Try Guessing higher...[chance left: " + i + "]");

            } else if (a > x) {
                System.out.println("\t\tYour guess is too high👎👎....Try Guessing lower...[chance left: " + i + "]");
            } else if (a == x)
            {

                System.out.println("\t\tCongratulation your guess is correct ie "+a+" ...You won the game..👌👌");
                System.exit(0);

            }
            i--;

        }
        if (a != x) {
            System.out.println("\t\tOOPS!...Sorry Chance over.");
            System.out.println("\t\tYou should have guessed: "+x);
        }

    }
}
