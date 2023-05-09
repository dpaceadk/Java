import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count=0;
        for(int i=1;i<num;i++){
            if (num%i==0){
                count++;

            }

        }
        if(count==1){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}