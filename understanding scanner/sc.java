import java.util.Scanner;
public class sc
{
    public static void main(String[] args)
    {
      System.out.println("enter your name:");
      Scanner input  = new Scanner(System.in);
      String name = input.nextLine();
      System.out.println("your name is"+name);
      
    }
}