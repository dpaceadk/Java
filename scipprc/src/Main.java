import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputObj= new Scanner(System.in);
        System.out.println("please enter S,P or R");
        char userMove =inputObj.next().charAt(0);
        System.out.println("User move>>>>" +userMove);

       char[] maxMove ={'S','P','R'};
       Random random = new Random();
        int number = random.nextInt(3);
        char computerMove = maxMove[number];
        System.out.println("computer move>>>>" + computerMove);
        if(computerMove == 'R'&& userMove == 'P'|| computerMove == 'P'&& userMove == 'S'|| computerMove == 'S'&& userMove == 'R'){
            System.out.println("User Wins");
        }
        else if(computerMove == userMove){
            System.out.println("Draw");
        }

        else {
            System.out.println("Computer Wins");
        }
    }
}